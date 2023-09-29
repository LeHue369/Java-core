package builder_pattern;

public class MainClass {

	public static void main(String[] args) {

		// With builder
		StudentBuilder studentBuilder = new StudentConcreteBuilder()
			.withFirstName("Tran")
			.withLastName("Quang Huy")
			.withCurrentClass("class A");

		System.out.println(studentBuilder.build());

		// without builder

		Student student = new Student("A", "B", "C", null, null, null); //=> need to create new Constructor

		System.out.println(student);

		//with builder annotation

		Student student1 = Student.builder().firstName("Hue").build();

		System.out.println(student1);
	}
}
