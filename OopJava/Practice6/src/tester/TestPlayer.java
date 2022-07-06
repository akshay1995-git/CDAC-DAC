package tester;

import java.util.HashMap;

import java.util.Scanner;
import java.io.*;
import com.app.core.Player;



public class TestPlayer {
public static int validateRank(int rank) {
	try {
	if(rank<5) {
	return rank;
	}
	}
	catch(Exception e) {
	System.out.println(e);
	}
	return rank;
}
	public static void main(String[] args) {
	try(Scanner sc=new Scanner(System.in)){
		HashMap<String,Player> map=new HashMap<>();
		boolean flag=true;
		while(flag) {
			System.out.println("Select Option \n1. Add Player to Map\n2. Display the total Map Player"
					+ "\n3. Remove Player From Map\n4. Exit from app and serialize mapData\n5. Deserialize Data");
			switch(sc.nextInt()) {
			case 1:
				System.out.println("Enter a Player Name : ");
				String name=sc.next();
				System.out.println("Enter a ID-Ranks-Points");
				map.put(name,new Player(sc.nextInt(),name,validateRank(sc.nextInt()),sc.nextDouble()));
				System.out.println("Player data mapped successfully...!!!");
				break;
			case 2:
				for(Player p:map.values()) {
					System.out.println(p);
				}
				break;
			case 3:
			/*	System.out.println("Enter a ID to remove Player :");
				int id=sc.nextInt();
				Player pid=new Player(id);
			   map.get(pid)).remove();
				if(map.containsKey(id)) {
					map.remove(id);
				}*/
				System.out.println("Enter a Player Name...!!");
				String pName=sc.next();
				if(map.containsKey(pName)){
					map.remove(pName);
					System.out.println("Product Info Removed SuccessFully...!!! ");
				}
				else {
					System.out.println("Product name not Found..");
				}
				break;
			case 4:
				System.out.println("Enter a file name...");
				ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(sc.next()));
				oos.writeObject(map);
				oos.flush();
				oos.close();
				System.out.println("Data Stored SuccessFully...!!!");
				flag=false;
				break;
			case 5:
				System.out.println("Enter a File Name : ");
				ObjectInputStream ois=new ObjectInputStream(new FileInputStream(sc.next()));
				@SuppressWarnings("unchecked") 
				HashMap<String,Player> data=(HashMap<String,Player>)ois.readObject();
				System.out.println(data);
				break;
			}
		}	
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	}

}
