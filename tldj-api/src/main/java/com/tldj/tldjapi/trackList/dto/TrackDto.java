package com.tldj.tldjapi.trackList.dto;

import com.tldj.tldjapi.trackList.entity.Track;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class TrackDto {

  private Long id;
  private String name;
  private Long playTime;

  public static TrackDto of(Long id, String name, Long playTime) {
    return new TrackDto(id, name, playTime);
  }

  public static TrackDto of(Track track) {
    return new TrackDto(track.getId(), track.getName(), track.getPlayTime());
  }

}
