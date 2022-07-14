 class Bank {


     private Bank(){
        System.out. println("Inside private constructor of Bank");

    }
      private static Bank ref;
     public static Bank getObject() {
         // we can call this constructor
         if (ref == null)
             ref = new Bank();
         return ref;
     }



 }
