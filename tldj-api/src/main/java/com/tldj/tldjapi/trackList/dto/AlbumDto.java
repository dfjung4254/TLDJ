package com.tldj.tldjapi.trackList.dto;

import com.tldj.tldjapi.trackList.entity.Album;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class AlbumDto {

  private Long id;
  private String title;
  private String description;
  private List<TrackDto> tracks;

  public static AlbumDto of(Album album) {
    return new AlbumDto(
        album.getId(),
        album.getTitle(),
        album.getDescription(),
        album.getTracks()
            .stream()
            .map(TrackDto::of)
            .collect(Collectors.toUnmodifiableList())
    );
  }

}
