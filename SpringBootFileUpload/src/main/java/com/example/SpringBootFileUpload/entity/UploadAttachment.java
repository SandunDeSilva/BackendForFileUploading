package com.example.SpringBootFileUpload.entity;


import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="upload_attachment")
public class UploadAttachment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String fileName;
    private String fileType;

    public UploadAttachment(
            String pFileName,
            String pFileType) {
        this.fileName = pFileName;
        this.fileType = pFileType;

    }
}
