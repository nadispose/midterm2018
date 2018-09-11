package math.problems;

import databases.ConnectToSqlDB;
import java.util.ArrayList;
import java.util.List;

import static databases.ConnectToSqlDB.insertDataFromArrayToSqlTable;

public class LowestNumber
{

	public static void main(String[] args)
	{
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use one of the databases from mysql or mongodb to store and to retrieve.
		 */
		int array[] = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};
		int small = Integer.MAX_VALUE;

		for(int i: array)
		{
			if(i<small)
			{
				small = i;
			}
		}
		System.out.println("Smallest num: " + small);
		//find lowest number from the array

		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
		List<String> lowestValue = new ArrayList<String>();

		try
		{
			insertDataFromArrayToSqlTable(array, "tbl_lowestNumber", "column_lowestNumber");
			lowestValue = connectToSqlDB.readDataBase("tbl_lowestNumber", "column_lowestNumber");
			System.out.println("Data is reading from the Table (tbl_primenumber) and displaying to the console");
			for (String st : lowestValue)
			{
				System.out.println(st);
			}

		} catch (Exception e) {			e.printStackTrace();		}
	}
}
