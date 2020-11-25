package com.dbest.lagostour;

public class TourItem  {

   private String mNameOfTourItem;
   private String mAddressOfTourItem;
   private String mTourItemQuality;
   private static final int NO_IMAGE_PROVIDED = -1;
   private int mImageResourceId = NO_IMAGE_PROVIDED;

   public TourItem( String nameOfTourItem, String addressOfTourItem, String tourItemQuality, int imageResourceId){
       mNameOfTourItem = nameOfTourItem;
       mAddressOfTourItem = addressOfTourItem;
       mTourItemQuality = tourItemQuality;
       mImageResourceId = imageResourceId;
   }
   public TourItem(String nameOfTourItem, String addressOfTourItem, String tourItemQuality){
       mNameOfTourItem = nameOfTourItem;
       mAddressOfTourItem = addressOfTourItem;
       mTourItemQuality = tourItemQuality;
   }

    public int getImageResourceId() {
        return mImageResourceId;
    }

    public boolean hasImage(){
       return mImageResourceId != NO_IMAGE_PROVIDED;
    }
    public String getNameOfTourItem(){
       return mNameOfTourItem;
    }
    public String getAddressOfTourItem(){
       return mAddressOfTourItem;
    }
    public String getTourItemQuality(){
       return mTourItemQuality;
    }
}
