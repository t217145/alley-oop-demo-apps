package com.hkjc.alleyoop.demo.models

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
import lombok.Builder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
data class DemoResponse(
    val msg: String,
    val myVar: String
)