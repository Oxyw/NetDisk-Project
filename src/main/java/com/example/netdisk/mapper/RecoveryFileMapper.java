package com.example.netdisk.mapper;

import java.util.List;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.example.netdisk.model.RecoveryFile;
import com.example.netdisk.vo.RecoveryFileListVO;

public interface RecoveryFileMapper extends BaseMapper<RecoveryFile> {
    List<RecoveryFileListVO> selectRecoveryFileList();
}
