public class Card implements Comparable<Card>{
    private String suit;
    private String name;
    private String[] nameOrder = new String[]{"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
    private String[] suitOrder = new String[] {"Hearts", "Clubs", "Diamonds", "Spades"};

    public Card(String n, String s){
        this.suit = s;
        this.name = n;
    }

    public String getSuit(){
        return this.suit;
    }

    public String getName(){
        return this.name;
    }

    public void setSuit(String s){
        this.suit = s;
    }

    public void setName(String n){
        this.name = n;
    }


    @Override
    public int compareTo(Card card){
        int myNameValue = -1;
        int newNameValue = -1;
        int mySuitVal = -1;
        int newSuitVal = -1;
        for (int i = 0; i<this.nameOrder.length; i++){
            if (this.name.equals(this.nameOrder[i])){
                myNameValue = i;
            }
            if (card.getName().equals(this.nameOrder[i])){
                newNameValue = i;
            }
        }

        for (int i = 0; i<this.suitOrder.length; i++){
            if (this.suit.equals(this.suitOrder[i])){             
                mySuitVal = i;
            }
            if (card.getSuit().equals(this.suitOrder[i])){
                newSuitVal = i;
            }
        }

        int diff = mySuitVal - newSuitVal;
        if (diff==0){
            diff = myNameValue - newNameValue;
        }
        return diff;
    }

    @Override
    public String toString(){
        return this.name + " of " + this.suit;
    }


}