package com.backend.dorun_api.service;

import com.backend.dorun_api.entity.Board;
import com.backend.dorun_api.repository.BoardRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BoardService {
    private final BoardRepository boardRepository;

    public Optional<Board> findById(Long id) {
        return boardRepository.findById(id);
    }
    public Board save(Board board) {
        return boardRepository.save(board);
    }
    public Optional<Board> update(Long id, Board newBoard) {
        return boardRepository.findById(id).map(board -> {
            board.setTitle(newBoard.getTitle());
            board.setContent(newBoard.getContent());
            return boardRepository.save(board);
        });
    }
    public void deleteById(Long id) {
        boardRepository.deleteById(id);
    }
}
