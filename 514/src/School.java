public class School {// �б�
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

	int phonenumber;// ��ȭ��ȣ
	int classroom; // ����
	String Schoolname;// �б���
	String address;// �ּ�
}

class Facility {// �ü�
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

	String Schooloffice; // ������
	String Administrativeoffice;// ������
	String Principaloffice;// �����
	String Nursingroom;// ���ǽ�
	String Practiceroom;// �ǽ���
	String Playground; // ���
	String auditorium;// ����
	String library; // ������
	String Consultationroom;// ����
	String pressroom;// �μ��
	String Studentdepartment; // �л���
}

class Gwa {// ��
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

	String Cardepartment;// �ڵ�����
	String WebContents;// ����������
}

class Student {// �л�
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

	int Grade;// �г�
	int grades;// ����
	String Attended;// ���

}

class Teacher {// ������
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

	String Koreanteacher;// �������
	String Mathteacher;// ���м�����
	String KoreanHistoryteacher;// ���缱����
	String Englishteacher;// �������
	String Musicteacher;// ���Ǽ�����
	String Technicalteacher;// ���������
	String Athleticteacher;// ä��������
	String healthteacher;// ���Ǽ�����

}

class evaluation {// ��
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

	String Performanceevaluation;// ������
	String WritingAssessment;// ������
}

class Outsideactivity {// �ܺ�Ȱ��
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

	String fieldtrip;// �����н�
	String Circles;// ���Ƹ�
	String Mathematicsevaluation;// ���п���
}
