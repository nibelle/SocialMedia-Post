public class TextPost extends Post {

    private String message;


/** 
 *
 * Text post
 *
 * @param userName,  the user name. 
 * @param message,  the message. 
 * @return public
 */
    public TextPost(String userName, String message) { 

      
      super(userName);
      this.message=message;
    }


/** 
 *
 * Getter method for message
 *
 * @return the message
 */
    public String getMessage() { 

	     return message;
    }


/** 
 *
 * To string
 *
 * @return String
 */
    public String toString() { 

    	String str = new String();
    	str = super.toString() + ", " + message;
    	return  str;
    }


/** 
 *
 * Is popular
 * Checks if likes are under 50
 * @return boolean
 */
  	public boolean isPopular() { 

  	
      return super.likes > 50;
  	}

}
