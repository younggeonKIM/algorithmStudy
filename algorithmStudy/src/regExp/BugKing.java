package regExp;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
// 3447
public class BugKing {

	/*문제
	버그 투성이 프로그램을 잘 만드는 백준이는 버그를 찾는 프로그램을 만들었다.
	
	이 프로그램은 프로그램의 소스 코드를 입력으로 받은 뒤, 버그를 발견하면 해당 부분을 주석처리해준다.
	
	하지만, 버그를 찾는 프로그램도 백준이가 작성했기 때문에 버그가 있다. 바로, 주석처리하는 대신에 그 부분을 BUG로 바꿔버린다.
	
	버그 찾는 프로그램이 처리한 결과가 주어졌을 때, BUG를 모두 없애는 프로그램을 작성하시오.
	
	입력
	입력은 여러 줄의 소스 코드로 이루어져 있다. 이 소스 코드는 백준이가 작성한 버그를 찾는 프로그램으로 이미 처리가 되어있다. 각 줄은 100글자 이내이고, 입력은 파일이 끝날 때 끝난다. 줄의 개수는 따로 제한을 두지 않는다.
	
	출력
	입력으로 주어진 소스 코드의 BUG를 모두 제거한 뒤 출력한다. 출력하는 소스 코드에는 BUG가 있으면 안 된다. 즉, ABUBUGGB와 같은 경우는 AB가 되어야 한다.*/
	/*Scanner sc = new Scanner(System.in);
	StringBuilder sb = new StringBuilder();
	Pattern p = Pattern.compile("(BUG)+");
	
	String input="", inputReplaced;
	
	try {
		
		while(sc.hasNext()) {
			input = sc.nextLine();
			Matcher m = p.matcher(input);
			inputReplaced= m.replaceAll("");
			sb.append(inputReplaced);
			
			sb.append("\n");
		}
		
		System.out.println(sb.toString());
	}
	catch (Exception e) {
		
	}
	finally {
		
		sc.close();
	}*/
	
	/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	String s;
	
	StringBuilder sb = new StringBuilder();
	while ((s = br.readLine()) != null) {
	
	    while (s.contains("BUG")) {
	        s = s.replaceAll("BUG", "");
	    }
	
	    sb.append(s + "\n");
	}
	
	bw.write(sb.toString());
	bw.close();
	br.close();*/
	public static void main(String[] args) throws IOException{
		
		
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String str;
		
		StringBuilder sb = new StringBuilder();
		
		while((str = br.readLine())!=null) {
			
			
			while(str.contains("BUG")) {
				
				str = str.replaceAll("BUG", "");
			}
			sb.append(str+"\n");
			
		}
		
		bw.write(sb.toString());
		bw.close();
		br.close();

	}

}
