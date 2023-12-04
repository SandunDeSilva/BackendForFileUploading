package com.example.SpringBootFileUpload.repository;

import com.example.SpringBootFileUpload.entity.UploadAttachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UploadAttachmentRepository extends JpaRepository<UploadAttachment, Long> {

}
