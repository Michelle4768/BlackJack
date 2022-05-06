public class Card extends Deck{
  int width;
  int height;
  String suit;
  String value;
  int num;
  int id;

  public Card(int seed){
    int n = seed % (BASE + SPECIALS.length);
    int s = seed / (BASE + SUITES.length);
    
    String val = (n == 0)? SPECIALS[n] : "" + (n + 1);
    if(n > BASE) val = SPECIALS[n-BASE];
    this.suit = SUITES[s];
    this.value = val;
    this.id = seed;
    this.num = n+1;
  }

  public String toString(){
    return super.toString() + " " + this.suit + this.value;
  }
}