package io.zipcoder;

public class Music {

    private String[] playList;

    public Music(String[] playList){
        this.playList = playList;
    }
        int forward,backwards = 0;
    public Integer selection(Integer startIndex, String selection) {
      for(int i = startIndex; i < playList.length; i++) {
          if (playList[i].equals(selection)) {
              break;
          } else {
              forward++;
          }
      }

          for (int i = startIndex; i >= 0; i--){
              if(playList[i].equals(selection)){
                  break;
              } else {
                  backwards++;
              }
          }
       return Math.min(backwards,forward);
    }
}
