package io.cellulant.security.websecurity.repository;

import io.cellulant.security.websecurity.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepository extends JpaRepository<UserInfo,Integer> {
}
