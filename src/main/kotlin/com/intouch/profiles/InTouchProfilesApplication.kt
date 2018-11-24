/*
 * Copyright (c) 2018 This file is subject to the terms and conditions defined in file 'LICENSE.txt' which is part of this source code package.
 */

package com.intouch.profiles

import com.intouch.microbase.config.DatabaseConfig
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.context.annotation.Import

@EnableEurekaClient
@SpringBootApplication
@Import(DatabaseConfig::class)
class InTouchProfilesApplication {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            SpringApplication.run(InTouchProfilesApplication::class.java, *args)
        }
    }
}