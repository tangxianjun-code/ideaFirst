package com.zking.test.until;

import org.springframework.validation.BindingResult;

public class ChechUtil {
    /**
     4      * 验证是否有异常
     5      *
     6      * @param bindingResult 参数验证结果
     7      * @throws Exception 直接抛出异常
     8      */
     public static void checkBindingResult(BindingResult bindingResult) throws Exception {
                if (bindingResult == null) {
                        return;
                     }
                 if (bindingResult.hasErrors()) {
                       String errorMessage = bindingResult.getAllErrors().get(0).getDefaultMessage();
                     if (errorMessage != null && errorMessage.length() > 50) {
                                 errorMessage = "参数错误";
                             }
                       throw new Exception(errorMessage);
                     }
             }
}
