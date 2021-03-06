package cn.sinjinsong.eshop.core.exception.mail;

import cn.sinjinsong.eshop.common.exception.annotation.RestField;
import cn.sinjinsong.eshop.common.exception.annotation.RestResponseStatus;
import cn.sinjinsong.eshop.common.exception.base.BaseRestException;
import org.springframework.http.HttpStatus;

/**
 * Created by SinjinSong on 2017/5/5.
 */
@RestResponseStatus(value= HttpStatus.NOT_FOUND,code=6)
@RestField("mailTarget")
public class MailTargetNotFoundException extends BaseRestException {
    public MailTargetNotFoundException(String target){
        super(target);
    }
}
