package com.cundong.izhihu.entity;

import java.io.Serializable;
import java.util.ArrayList;

public class NewsListEntity extends BaseEntity implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8745847207188927701L;

	public String date;
	public ArrayList<NewsEntity> stories;
	
	public static class NewsEntity implements Serializable {
		
		/**
		 * 
		 */
		private static final long serialVersionUID = 1L;
		public String title;
		public String share_url;
		public String ga_prefix;
		public ArrayList<String> images;
		public int type;
		public long id;

		public boolean subscribed;
		public String theme_name;
		public int theme_id;
		
	}
}
