public class PallindromeTest {
    public static void main(String[] args) {
        MyQueuePallindrome<String> myQueue = new MyQueuePallindrome<>();
        MyStackPanlllindrome<String> myStack = new MyStackPanlllindrome<>();
        String myString = "Able was I ere I saw Elba";
        String myStringArray[] = myString.split("");
        for(String element: myStringArray){
            myStack.push(element);
            myQueue.enqueue(element);
        }
        boolean isPallindrome = true;
        while (!myQueue.isEmty()){
            if(!myQueue.deqeue().equalsIgnoreCase(myStack.pop())){
                isPallindrome = false;
                break;
            }
        }

        if(isPallindrome){
            System.out.println(myString + " is pallindrome");
        }
        else {
            System.out.println(myString + " is not pallindrome");
        }
    }
}
