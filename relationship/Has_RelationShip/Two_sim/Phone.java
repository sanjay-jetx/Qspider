package relationship.Has_RelationShip.Two_sim;

public class Phone {
    int prize;
    Sim S_obj[] = new Sim[2];

    void add(String operators, int balance) {
        for (int i = 0; i < S_obj.length; i++) {
            if (S_obj[i] == null) {
                S_obj[i] = new Sim();
                S_obj[i].operators = operators;
                S_obj[i].balance = balance;
                System.out.println(S_obj[i].balance + " " +S_obj[i].operators);
                return;
            }
        }
        System.out.println("it is full");

    }
}
