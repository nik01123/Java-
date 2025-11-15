//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or

public class Main {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //System.out.println("Hello World");
        //Car myCar = new Car(25,"1BCE32", Color.BLUE,true);
        //Car sally_car = new Car(30,"1NIK2001", Color.BLACK,false);
        //System.out.println("My car's license plate: "+ myCar.licensePlate)
        // System.out.println("Sally's license plate: "+ sally_car.licensePlate);
        //        System.out.println(myCar.paintColor);
        //        myCar.changePaintColor(Color.YELLOW);
        //        System.out.println(myCar.paintColor);
        //String userInput = sc.next(); //userInput is
        // an instance of class String.
//Since Class String is already there,we only need to call it in Main class
        //System.out.println(userInput.toUpperCase());
        //String caps = userInput.toUpperCase();
        //System.out.println(caps);
//after . u get the list of methods in class string. Since userIn.. is
        //instance of string, u can avail all methods of class string
        //char firstCharacter = userInput.charAt(0);
        //System.out.println(firstCharacter);
//String is immutable once we create it(instance)
//Any methods in class string cant change the original value permanently
//check if substring is there
        //System.out.println("Contains enter: "+userInput.contains("enter"));
//scanner is a class, from util package, it needs to be imported
// Array is a container that stores a sequence of values of same type
        //int[] numbers = new int[5];
        //array of int is declared and space allocated
        //numbers[0] = 31;
        //numbers[1] = 4;
        //numbers[2] = 98;
        //numbers[3] = 5;
        //numbers[4] = 67;// initialize
        //Arrays.sort(numbers);
        //System.out.println(numbers); //only order of numbers is changed, so u can get it(mutable)
        // u get address as output since arrray is refernce type
        //System.out.println(Arrays.toString(numbers));
        //int[] num2 = {31,4,98,5,67}; //declared, allocated and initialize in one line

        //String[] myFavCandyBars = {"Twix","Hershey's","Buno"};
        //System.out.println("Index 1: "+myFavCandyBars[1]);
        //myFavCandyBars[2] = "ButterFingers";
        //System.out.println(myFavCandyBars[2]);
        //System.out.println(myFavCandyBars.length);

        //double myCarSpeed = 50;
//        myCar.speedingUp(myCarSpeed);
//        System.out.println(myCarSpeed);
//Output of above myCarspeed is 50 itself no change
//to change the value of a var through a function, return the parament value ; return currentSpeed;
        //myCarSpeed = myCar.speedingUp(myCarSpeed);
        //System.out.println(myCarSpeed);

//        String s = "dog";
//        String replacedString = s.replace('d','f');
//        System.out.println(replacedString);

        //dog myDog = new dog(Color.BLACK, "Chihwawa", "Brownie" );
        //dog SallyDog = new dog(Color.BLACK, "Pug", "Pup");

        //System.out.println(myDog.colorOfDog);
        //System.out.println(SallyDog.nameOfDog);
        //myDog.bark();
        //myDog.fetch();
        //myDog.fetch();
        //myDog.fetch();
        //myDog.fetch();

//        System.out.println("Enter an age: ");
//        Scanner sc = new Scanner(System.in);
//        int age = sc.nextInt();
//        if (age>=0 && age<=5){
//            System.out.println("baby");
//        } else if (age>=6 && age<=11) {
//            System.out.println("kid");
//
//        } else if (age>=12 && age<=17) {
//
//            System.out.println("teen");
//
//        }else if(age>=18){
//            System.out.println("Adult");
//        }
//        else{
//              System.out.println("Invalid");
//        }
//        System.out.println("While loop:");
//        int x = 3;
//        while(x > 0){
//            System.out.println("Current x:" + x);
//            x = x-1;
//
//        }
//        System.out.println("Final x:" + x);

        // DO WHILE
//        System.out.println("DO WHILE:");
//        int y=3;
//        do {
//            System.out.println("Current y:"+y);
//            y=y-1;
//        } while (y>0);
//        System.out.println("Final y:"+y);

        //For loop

//        System.out.println("For loop:");
//        for (int i=3; i>0; i--){
//            System.out.println("Current i:"+i);
//        }

        // java lib
//        double power = Math.pow(5,3);
//        double sq = Math.sqrt(64);
//        System.out.println("Sqr root:"+sq);
//        System.out.println("power:"+power);

//        Random randint = new Random();
//        int rndNum = randint.nextInt();
//        int rndNumWithBound = randint.nextInt(10);
//        System.out.println(rndNum);
//        System.out.println(rndNumWithBound);

//          coin strt = new coin();
//        System.out.println("Before: "+strt.fceShow());
//      for(int i=0;i<10;i++){
//           strt.flip();
//          System.out.println(strt.fceShow());
//
//      }
//      strt.showcount();

//        dice play= new dice();
//        for(int i=0;i<10;i++){
//        play.roll();
//        System.out.println(play.getFaceUp1()+","+ play.getFaceUp2());}

//            bankAccount newAcc = new bankAccount(21323, 1000000);
//            newAcc.deposit(-100);
//            newAcc.withdraw(100000000);
//            newAcc.deposit(100);
//            newAcc.withdraw(100);

              insects insect = new insects(5,6);
              Spider spider = new Spider(13, true);
              cricket crickets = new cricket(2,1.25);

              insect.crawl();
              insect.say();
              spider.crawl();
              spider.say();
              crickets.say();
              crickets.crawl();
              crickets.jump();

              if(spider instanceof insects && spider instanceof Spider){
                  System.out.println("Spider is both an insect and a spider");
              }


    }
}



