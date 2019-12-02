package com.base.service.impl;

import com.base.beans.Member;
import com.base.mapper.MemberMapper;
import com.base.service.MemberService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author YangBo
 * @since 2019-12-02
 */
@Service
public class MemberServiceImpl extends ServiceImpl<MemberMapper, Member> implements MemberService {

}
