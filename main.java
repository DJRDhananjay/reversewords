public class Main
{
	public static void main(String[] args) {
		String name="Dhananjay Kumar Ravi";
		String words[]=name.split(" ");
		String reverse="";
		for(int i=0;i<words.length;i++){
		    String word=words[i];
		    for(int j=word.length()-1;j>=0;j--){
		    reverse=reverse+word.charAt(j);
		    }
		    reverse=reverse+" ";
		    }
		System.out.print(reverse);
	}
}
