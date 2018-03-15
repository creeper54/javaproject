import org.omg.Messaging.SyncScopeHelper;

public class Libray {
	
	Book book = new Book();
	User user = new User();
	Employee employee = new Employee();
	Novel novel  = new Novel();
	Openclose openclose = new Openclose();
		

  public static void main(String[] args){
	  
	  
  }
}

  class Book{
	  String Novel;//소설
	  String Manga;//만화	
	  String Magazine;//잡지
	  String Encyclopedia;//백과사전
	  String Essay;//수필
  }
  class User{
	  String Student;//학생
	  String Adult;//성인
	  String Child;//어린이  
  }
  class Employee{
	  String Libraryclub;//도서관 동아리
	  String Libraryteacher;//도서관선생님
  }
  class Novel{
	  String Reasoning;//추리
	  String Thriller;//스릴러
	  String Fantasy;//판타지
	  String Martialarts;//무협
	  String Fear;//공포
	  
  }
  class Openclose{
	  int Open;//여는시간
	  int Close;//닫는시간
  }
  
    
 
  