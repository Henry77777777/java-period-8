class Main {

  public static void main(String[] args) {
    (new Main()).init();
  }
  void print(Object o){ System.out.println(o);}
  void printt(Object o){ System.out.print(o);}

  void init(){

    
  }
  function collegeCredit;{
    System.out.println("Enter course code");
    string course = Input.readString;
    if (course.Substring(6)equals.IgnoreCase(e) || course.Substring(6)equals.IgnoreCase(m)) {
      return "true";
    }
    else{
      return "false";
    }
  }

   function getcounciler{
    System.out.println("Enter Letter");
    string counciler = Input.readString;
    if (counciler.Substring(1).equals.IgnoreCase(B)) {
      return "Berrouet";
    }
    ElseIf(counciler.Substring(1).equals.IgnoreCase(C)) {
      return "Chu";
    }
    ElseIf(counciler.Substring(1).equals.IgnoreCase(D)) {
      return "Dinn";
    }
    ElseIf(counciler.Substring(1).equals.IgnoreCase(E)) {
      return "Eyzengart";
    }
    ElseIf(counciler.Substring(1).equals.IgnoreCase(F)) {
      return "Flores";
    }
    ElseIf(counciler.Substring(1).equals.IgnoreCase(G)) {
      return "Gibson";
    }
    ElseIf(counciler.Substring(1).equals.IgnoreCase(L)) {
      return "Shim Lee";
    }
    ElseIf(counciler.Substring(1).equals.IgnoreCase(M)) {
      return "Meltzer";
    }
    ElseIf(counciler.Substring(1).equals.IgnoreCase(P)) {
      return "Paccione";
    }
    ElseIf(counciler.Substring(1).equals.IgnoreCase(S)) {
      return "Fiore";
    }
    ElseIf(counciler.Substring(1).equals.IgnoreCase(T)) {
      return "Tsai";
    }
    ElseIf(counciler.Substring(1).equals.IgnoreCase(Z)){
      return "Zayes";
    }
    else{
      return "idk"
    }
  } 
 
   function imageType{
    System.out.println("Enter file name ");
    string image = Input.readString;
    if (image.equals(JPG) || image.Substring.equals(JPeg)){
      return "Joint Photographic Experts Group";
    }
    ElseIf(image.equals.IgnoreCase(png)){
      return "portable network graphics";
    }
    ElseIf(image.equals.IgnoreCase(gif)){
      return "graphics interface format";
    }
    ElseIf(image.equals.IgnoreCase(pdf)){
      return "portable network graphics";
    }
    else{
      return "idk"
    }
}