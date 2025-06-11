package Activites;


	abstract class Book{
		String title;
		public abstract void setTitle(String title);
		
		public String getTitle() {
			return title;
		}
	}
	class MyBook extends Book{

		@Override
		public void setTitle(String title) {
			// TODO Auto-generated method stub
			if(title!=null && !title.isEmpty()) {
				this.title=title;
			}
		}
		
	}
	public class Activity5 {
		public static void main(String[] args) {
			Book someBook=new MyBook();
			someBook.setTitle("Percy Jackson and the Titan's curse");
			System.out.println("Book added is:"+someBook.getTitle());
		}
}
