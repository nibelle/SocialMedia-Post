

 /**
 * Class News feed
 */ 
public class NewsFeed {

    private Post[] messages;
    private int size;
    public static final int MAX_SIZE = 25;


/** 
 *
 * NewsFeed Constructor. 
 *
 */
    public NewsFeed() { 

    	// Your code here.
		messages = new Post[MAX_SIZE];     
		size = 0;
    }


/** 
 *
 * Add
 *
 * @param message  adding message. 
 */
    public void add(Post message) { 

      // Your code here.
	  if (size < MAX_SIZE) {       
		messages[size] = message;      
		size++;     
	}
    }


/** 
 *
 * Getter
 *
 * @param index,  the index. 
 * @return 
 */
    public Post get(int index) { 

	     return messages[index];
    }


/** 
 *
 * Size
 *
 * @return int
 */
    public int size() { 

	     return size;
    }


/** 
 *
 * Sorting method
 *
 */
	  public void sort(){ 

			int i, j, argMin;
			Post tmp;
			for (i = 0; i < size - 1; i++) {
				argMin = i;
				for (j = i + 1; j < size(); j++) {
					if (messages[j].compareTo(messages[argMin]) < 0) {
						argMin = j;
					}
				}

  			tmp = messages[argMin];
  			messages[argMin] = messages[i];
  			messages[i] = tmp;
		  }

	  }


/** 
 *
 * NewsFeed Constructor. 
 *
 */
  	public NewsFeed getPhotoPost(){ 

  		// Your code here
		  NewsFeed photoFeed = new NewsFeed();      
		  for (int i=0; i < size; i++) {        
			if (messages[i] instanceof PhotoPost) photoFeed.add(messages[i]);     
		 	}      
		  return photoFeed;
  	}


/** 
 *
 * NewsFeed PLUS constructor. 
 *
 * @param other . 
 */
  	public NewsFeed plus(NewsFeed other){ 


  	  // Your code here
		NewsFeed combinedNewsFeed = new NewsFeed();      
		for (int i=0; i < this.size; i++) {        
			combinedNewsFeed.add(this.messages[i]);      
		    combinedNewsFeed.sort();      
		}      
		for (int i=0; i < other.size; i++) {        
			combinedNewsFeed.add(other.messages[i]);      
			combinedNewsFeed.sort();      
		}      
		return combinedNewsFeed;
  	}

}
