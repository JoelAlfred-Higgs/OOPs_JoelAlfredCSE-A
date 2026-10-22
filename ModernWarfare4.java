import java.util.ArrayList;
import java.util.HashSet;
import java.util.HashMap;
import java.util.Scanner;

/* 

A simple program on Modern Warfare 4(2026)
-> store the Intel in the form of HashMap
-> store the Loadout in HashSet
-> store the sequence of act in ArrayList


*/

class Mission{
    String op = "Meet and Assasinate Archer ";
    String location = "PARIS";
    
    void display_mission(){
        System.out.println("LOCATION = "+location);
        System.out.println("OBJECTIVE = "+op);
    }
} 

class MissionObjectives{
    
    void mission(ArrayList<String> M){
        M.add("Secure the cargo van / package");
        M.add("Defend the Asset");
        M.add("Assasinate Archer among interaction");
    }
    void display_objectives(ArrayList<String> M){
        System.out.println(M);
    }
}

class Intel{

    void get_intel(HashMap<String,String> I){
        I.put("INTE231","Valeria has direct deal with Archer");
        I.put("INTG435","There is another group conflicting with valeria over the deal");
        I.put("INTF849","Archer has connections with North Koreans");
    }
    void display_intel(HashMap<String,String> I){
        System.out.println(I);
    }
}

class LoadOut{
    
    void loadout(HashSet<String> L){
        L.add("M40");
        L.add("Frag Grenade");
        L.add("Armor");
        L.add("Knife");
    }

    void view_loadout(HashSet<String> L){
        System.out.println(L);
    }
}
class Auth{
    void details(HashMap<String,String> A){
        A.put("ID1406","Price");
        A.put("ID2001","Ghost");
        A.put("ID2611","Gaz");
}
    boolean check(HashMap<String,String> A,String id){
        if(A.containsKey(id.toUpperCase()))
             return true;
        return false;

    }
}

public class ModernWarfare4{
    public static void main(String[] args){
        ArrayList<String> M = new ArrayList<>();
        HashSet<String> L  = new HashSet<>();
        HashMap<String,String> I = new HashMap<>();
        HashMap<String,String> A = new HashMap<>();
        Mission m = new Mission();
        int ch;
        String id;
        Scanner sc  = new Scanner(System.in);
        System.out.print("ID: ");
        id = sc.nextLine();
        Auth o = new Auth();
        o.details(A);

        if(o.check(A,id)){
            m.display_mission();
            System.out.println("1-MissionObjectives\n2-Intel\n3-Loadout");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    MissionObjectives obj = new MissionObjectives();
                    obj.mission(M);
                    obj.display_objectives(M);
                    break;

                case 2:
                     Intel intel = new Intel();
                     intel.get_intel(I);
                     intel.display_intel(I);
                     break;
                case 3:
                    LoadOut load  = new LoadOut();
                    load.loadout(L);
                    load.view_loadout(L);
                    break;

            }
        }
        else{
            System.out.print("Authentication Failed! Self Destruct in 10 seconds");
        }
   sc.close();
    }
}


