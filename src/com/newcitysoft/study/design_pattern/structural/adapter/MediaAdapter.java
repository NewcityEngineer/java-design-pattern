package com.newcitysoft.study.design_pattern.structural.adapter;

import com.newcitysoft.study.design_pattern.structural.adapter.player.AdvancedMediaPlayer;
import com.newcitysoft.study.design_pattern.structural.adapter.player.MediaPlayer;
import com.newcitysoft.study.design_pattern.structural.adapter.player.Mp4Player;
import com.newcitysoft.study.design_pattern.structural.adapter.player.VlcPlayer;

public class MediaAdapter implements MediaPlayer {

   AdvancedMediaPlayer advancedMusicPlayer;

   public MediaAdapter(String audioType){
      if(audioType.equalsIgnoreCase("vlc") ){
         advancedMusicPlayer = new VlcPlayer();
      } else if (audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer = new Mp4Player();
      }    
   }

   @Override
   public void play(String audioType, String fileName) {
      if(audioType.equalsIgnoreCase("vlc")){
         advancedMusicPlayer.playVlc(fileName);
      }else if(audioType.equalsIgnoreCase("mp4")){
         advancedMusicPlayer.playMp4(fileName);
      }
   }
}