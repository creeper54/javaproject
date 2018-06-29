public class School {// 학교
	public int getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(int phonenumber) {
		this.phonenumber = phonenumber;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public String getSchoolname() {
		return Schoolname;
	}

	public void setSchoolname(String schoolname) {
		Schoolname = schoolname;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	int phonenumber;// 전화번호
	int classroom; // 교실
	String Schoolname;// 학교명
	String address;// 주소
}

class Facility {// 시설
	public String getSchooloffice() {
		return Schooloffice;
	}

	public void setSchooloffice(String schooloffice) {
		Schooloffice = schooloffice;
	}

	public String getAdministrativeoffice() {
		return Administrativeoffice;
	}

	public void setAdministrativeoffice(String administrativeoffice) {
		Administrativeoffice = administrativeoffice;
	}

	public String getPrincipaloffice() {
		return Principaloffice;
	}

	public void setPrincipaloffice(String principaloffice) {
		Principaloffice = principaloffice;
	}

	public String getNursingroom() {
		return Nursingroom;
	}

	public void setNursingroom(String nursingroom) {
		Nursingroom = nursingroom;
	}

	public String getPracticeroom() {
		return Practiceroom;
	}

	public void setPracticeroom(String practiceroom) {
		Practiceroom = practiceroom;
	}

	public String getPlayground() {
		return Playground;
	}

	public void setPlayground(String playground) {
		Playground = playground;
	}

	public String getAuditorium() {
		return auditorium;
	}

	public void setAuditorium(String auditorium) {
		this.auditorium = auditorium;
	}

	public String getLibrary() {
		return library;
	}

	public void setLibrary(String library) {
		this.library = library;
	}

	public String getConsultationroom() {
		return Consultationroom;
	}

	public void setConsultationroom(String consultationroom) {
		Consultationroom = consultationroom;
	}

	public String getPressroom() {
		return pressroom;
	}

	public void setPressroom(String pressroom) {
		this.pressroom = pressroom;
	}

	public String getStudentdepartment() {
		return Studentdepartment;
	}

	public void setStudentdepartment(String studentdepartment) {
		Studentdepartment = studentdepartment;
	}

	String Schooloffice; // 교무실
	String Administrativeoffice;// 행정실
	String Principaloffice;// 교장실
	String Nursingroom;// 보건실
	String Practiceroom;// 실습실
	String Playground; // 운동장
	String auditorium;// 강당
	String library; // 도서관
	String Consultationroom;// 상담실
	String pressroom;// 인쇄실
	String Studentdepartment; // 학생부
}

class Gwa {// 과
	public String getCardepartment() {
		return Cardepartment;
	}

	public void setCardepartment(String cardepartment) {
		Cardepartment = cardepartment;
	}

	public String getWebContents() {
		return WebContents;
	}

	public void setWebContents(String webContents) {
		WebContents = webContents;
	}

	String Cardepartment;// 자동차과
	String WebContents;// 웹콘텐츠과
}

class Student {// 학생
	public int getGrade() {
		return Grade;
	}

	public void setGrade(int grade) {
		Grade = grade;
	}

	public int getGrades() {
		return grades;
	}

	public void setGrades(int grades) {
		this.grades = grades;
	}

	public String getAttended() {
		return Attended;
	}

	public void setAttended(String attended) {
		Attended = attended;
	}

	int Grade;// 학년
	int grades;// 성적
	String Attended;// 출결

}

class Teacher {// 선생님
	public String getKoreanteacher() {
		return Koreanteacher;
	}

	public void setKoreanteacher(String koreanteacher) {
		Koreanteacher = koreanteacher;
	}

	public String getMathteacher() {
		return Mathteacher;
	}

	public void setMathteacher(String mathteacher) {
		Mathteacher = mathteacher;
	}

	public String getKoreanHistoryteacher() {
		return KoreanHistoryteacher;
	}

	public void setKoreanHistoryteacher(String koreanHistoryteacher) {
		KoreanHistoryteacher = koreanHistoryteacher;
	}

	public String getEnglishteacher() {
		return Englishteacher;
	}

	public void setEnglishteacher(String englishteacher) {
		Englishteacher = englishteacher;
	}

	public String getMusicteacher() {
		return Musicteacher;
	}

	public void setMusicteacher(String musicteacher) {
		Musicteacher = musicteacher;
	}

	public String getTechnicalteacher() {
		return Technicalteacher;
	}

	public void setTechnicalteacher(String technicalteacher) {
		Technicalteacher = technicalteacher;
	}

	public String getAthleticteacher() {
		return Athleticteacher;
	}

	public void setAthleticteacher(String athleticteacher) {
		Athleticteacher = athleticteacher;
	}

	public String getHealthteacher() {
		return healthteacher;
	}

	public void setHealthteacher(String healthteacher) {
		this.healthteacher = healthteacher;
	}

	String Koreanteacher;// 국어선생님
	String Mathteacher;// 수학선생님
	String KoreanHistoryteacher;// 역사선생님
	String Englishteacher;// 영어선생님
	String Musicteacher;// 음악선생님
	String Technicalteacher;// 기술선생님
	String Athleticteacher;// 채육선생님
	String healthteacher;// 보건선생님

}

class evaluation {// 평가
	public String getPerformanceevaluation() {
		return Performanceevaluation;
	}

	public void setPerformanceevaluation(String performanceevaluation) {
		Performanceevaluation = performanceevaluation;
	}

	public String getWritingAssessment() {
		return WritingAssessment;
	}

	public void setWritingAssessment(String writingAssessment) {
		WritingAssessment = writingAssessment;
	}

	String Performanceevaluation;// 수행평가
	String WritingAssessment;// 지필평가
}

class Outsideactivity {// 외부활동
	public String getFieldtrip() {
		return fieldtrip;
	}

	public void setFieldtrip(String fieldtrip) {
		this.fieldtrip = fieldtrip;
	}

	public String getCircles() {
		return Circles;
	}

	public void setCircles(String circles) {
		Circles = circles;
	}

	public String getMathematicsevaluation() {
		return Mathematicsevaluation;
	}

	public void setMathematicsevaluation(String mathematicsevaluation) {
		Mathematicsevaluation = mathematicsevaluation;
	}

	String fieldtrip;// 현장학습
	String Circles;// 동아리
	String Mathematicsevaluation;// 수학여행
}
