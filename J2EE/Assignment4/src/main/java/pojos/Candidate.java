package pojos;

public class Candidate {
private int id;
private String name;
private String party_name;
private int votes;
public Candidate(int id, String name, String party_name, int votes) {
	super();
	this.id = id;
	this.name = name;
	this.party_name = party_name;
	this.votes = votes;
}
public Candidate(String name, String party_name) {
	super();
	this.name = name;
	this.party_name = party_name;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getParty_name() {
	return party_name;
}
public void setParty_name(String party_name) {
	this.party_name = party_name;
}
public int getVotes() {
	return votes;
}
public void setVotes(int votes) {
	this.votes = votes;
}
@Override
public String toString() {
	return "Candidate [id=" + id + ", name=" + name + ", party_name=" + party_name + ", votes=" + votes + "]";
}

}
