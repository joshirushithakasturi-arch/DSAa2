public class Candidate {
    int id;
    String name;
    String skill;
    int experience;

    Candidate(int id, String name, String skill, int experience) {
        this.id = id;
        this.name = name;
        this.skill = skill;
        this.experience = experience;
    }

    @Override
    public String toString() {
        return id + " " + name + " " + skill + " " + experience + " years";
    }
}