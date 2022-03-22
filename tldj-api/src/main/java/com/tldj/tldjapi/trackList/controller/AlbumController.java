package com.tldj.tldjapi.trackList.controller;

import com.tldj.tldjapi.trackList.dto.AlbumDto;
import com.tldj.tldjapi.trackList.entity.Album;
import com.tldj.tldjapi.trackList.entity.Track;
import com.tldj.tldjapi.trackList.repository.AlbumRepository;
import com.tldj.tldjapi.trackList.service.AlbumService;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@RequestMapping("/v1/album")
@RequiredArgsConstructor
public class AlbumController {

  private final AlbumService albumService;
  private final AlbumRepository albumRepository;

  @PostMapping()
  public ResponseEntity<AlbumDto> createAlbum() {

    // sample
    int trackSize = 12;
    List<Track> tracks = new ArrayList<>();
    for(int i = 0; i < trackSize; i++) {
      Track track = new Track();
      track.setName("test" + i);
      track.setPlayTime(100L + i);
      tracks.add(track);
    }

    Album album = Album.create("Test Album1", "this is album1");
    album.addAll(tracks);

    albumRepository.save(album);

    return ResponseEntity.status(HttpStatus.OK)
        .body(AlbumDto.of(album));
  }

}
