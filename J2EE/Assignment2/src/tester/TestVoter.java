package tester;


import java.util.Scanner;

import dao.VoterDaoImp;
import dao.CandidateDaoReg;
//import static utils.DBUtils.closeConnection;
public class TestVoter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try (Scanner sc = new Scanner(System.in)) {
			boolean exit = false;
			// init DAO layer : create instance of dao layer
			VoterDaoImp dao = new VoterDaoImp();
			CandidateDaoReg cdr=new CandidateDaoReg();
			while (!exit) {
				System.out.println("Options 1 . Display Voters details  2.Candidates Registration. 3.Display candidate table data"
						+ "  4.Cast and Vote   5.update votes of candidate.  100.Exit");
				try {
					switch (sc.nextInt()) {
					case 1:// Display emp details , from a specific dept , joined after a particular date
						System.out.println("Enter Email and Password");
						System.out.println("Voter list");
						dao.fetchVoterDetails(sc.next(), sc.next()).forEach(System.out::println);
						break;
					case 2:
						System.out.println("Enter Candidate Name and Party_name : ");
						System.out.println("CandidateDao");
						cdr.registerCandidate(sc.next(),sc.next());
						System.out.println("Candidate Registered");
						break;
					case 3:
						cdr.candidateData();
						break;
					case 4:
						
						break;
					case 5:
						System.out.println("Enter id and vote :");
						cdr.updateVotes(sc.nextInt(), sc.nextInt());
						break;
					case 6:
						exit = true;
						dao.cleanUp();
						cdr.cleanUp();
						break;
					}
				}
				catch (Exception e) {
					e.printStackTrace();
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
			
				
				
			}
			

}
