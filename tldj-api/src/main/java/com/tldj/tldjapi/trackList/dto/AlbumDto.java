package com.tldj.tldjapi.trackList.dto;

import com.tldj.tldjapi.trackList.entity.Album;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class AlbumDto {

  private Long id;

  @NotBlank
  @Size(min = 1, max = 200)
  private String title;

  @NotBlank
  @Size(min = 1, max = 200)
  private String description;

  @NotBlank
  @Size(min = 1, max = 200)
  private String author;



  public static AlbumDto of(Album album) {
    return new AlbumDto(album.getId(), album.getTitle(), album.getDescription(), album.getAuthor());
  }
}
