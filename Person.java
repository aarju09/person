class Person
{
	private String home_address;
	private String office_address;
	private String phone;
	Person(String home_address , String office_address ,String phone)
	{
		
		System.out.println("Home address is : "+home_address);
		System.out.println("office address is : " +office_address);
		System.out.println("phone number is : "+phone);
		//this.home_address=home_address;
		//this.office_address=office_address;
		//this.phone=phone;
	}
		public static void main(String[] args)
		{
			Person b = new Person("abcd","efgh","12345");

		}
}