package com.tldj.tldjapi.trackList.service;

import com.tldj.tldjapi.trackList.entity.Album;
import com.tldj.tldjapi.trackList.repository.AlbumRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AlbumService {

  private AlbumRepository albumRepository;

  public Album create(Album album) {

    Album saved = albumRepository.save(album);

    return saved;
  }

}
