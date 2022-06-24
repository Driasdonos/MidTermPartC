public class UserProfile 
{
   
   private String userID;
   private String genre;
   private String[] genres = {"Comedy", "Sci-fi", "Action", "Fantasy"};
   
   
   public UserPfl(String inputID, String selectGenre)
   {
       userID = inputID;
       genre= selectGenre;
   }


   public String getUserID() {
       return userID;
   }

   public void setUserID(String userID) {
       this.userID = userID;
   }

   public String getGenre() {
       return genre;
   }

   public void setGenre(String genre) {
       this.genre = genre;
   }
   
}
