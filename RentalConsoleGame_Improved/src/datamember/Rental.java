package datamember;

public class Rental {
    public static void main(String[] args){
       Member m = new Member();
       m.dataMember();
       Data data = m.inputMember();
       switch(data.Jenis){
           case "Silver":
               Silver s =new Silver(data);
               s.hitungBiaya();
               s.printSilver();
               break;
           case "Gold":
               Gold g = new Gold(data);
               g.hitungBiaya();
               g.printGold();
               break;
           case "Platinum":
               Platinum p = new Platinum(data);
               p.hitungBiaya();
               p.printPlatinum();
               break;
       }
   }
}
