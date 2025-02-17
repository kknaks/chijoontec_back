package com.example.chijoon_tec.domain.category.service;

import com.example.chijoon_tec.domain.category.entity.PrimaryCategory;
import com.example.chijoon_tec.domain.category.entity.SecondaryCategory;
import com.example.chijoon_tec.domain.category.repository.SecondaryRepository;
import com.example.chijoon_tec.domain.category.repository.PrimaryRepository;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryService {

  private final PrimaryRepository primaryRepository;
  private final SecondaryRepository secondaryRepository;

  public List<PrimaryCategory> getPrimaryList() {
    return primaryRepository.findAll();
//    return primaryCategories.stream()
//        .map(PrimaryCategory::getPrimaryCategory)
//        .collect(Collectors.toList());
  }

  public List<SecondaryCategory> getSecondaryList(Long selectedCategoryId) {
    return secondaryRepository.findSecondaryCategoryByPrimaryCategoryId(selectedCategoryId);
//    return secondaryCategories.stream()
//        .map(SecondaryCategory::getSecondaryCategory)
//        .collect(Collectors.toList());
  }
}
