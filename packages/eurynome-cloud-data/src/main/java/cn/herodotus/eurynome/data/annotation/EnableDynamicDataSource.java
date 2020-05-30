/*
 * Copyright (c) 2019-2020 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 *
 * Project Name: eurynome-cloud
 * Module Name: eurynome-cloud-data
 * File Name: EnableDynamicDataSource.java
 * Author: gengwei.zheng
 * Date: 2020/5/23 上午10:08
 * LastModified: 2020/5/23 上午10:08
 */

package cn.herodotus.eurynome.data.annotation;

import cn.herodotus.eurynome.data.configuration.DynamicDataSourceConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * <p>Project: eurynome-cloud </p>
 * <p>File: EnableDynamicDataSource </p>
 *
 * <p>Description: 开启动态数据源 </p>
 *
 * @author : gengwei.zheng
 * @date : 2020/5/23 10:08
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@EnableAspectJAutoProxy
@Import(DynamicDataSourceConfiguration.class)
public @interface EnableDynamicDataSource {
}
