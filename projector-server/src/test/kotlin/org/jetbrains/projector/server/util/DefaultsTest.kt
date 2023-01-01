/*
 * Copyright (c) 2019-2023, JetBrains s.r.o. and/or its affiliates. All rights reserved.
 * DO NOT ALTER OR REMOVE COPYRIGHT NOTICES OR THIS FILE HEADER.
 *
 * This code is free software; you can redistribute it and/or modify it
 * under the terms of the GNU General Public License version 2 only, as
 * published by the Free Software Foundation. JetBrains designates this
 * particular file as subject to the "Classpath" exception as provided
 * by Oracle in the LICENSE file that accompanied this code.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU General Public License
 * version 2 for more details (a copy is included in the LICENSE file that
 * accompanied this code).
 *
 * You should have received a copy of the GNU General Public License version
 * 2 along with this work; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin St, Fifth Floor, Boston, MA 02110-1301 USA.
 *
 * Please contact JetBrains, Na Hrebenech II 1718/10, Prague, 14000, Czech Republic
 * if you need additional information or have any questions.
 */
package org.jetbrains.projector.server.util

import org.jetbrains.projector.common.misc.Defaults
import org.jetbrains.projector.server.core.convert.toClient.toBasicStrokeData
import java.awt.BasicStroke
import kotlin.test.Test
import kotlin.test.assertEquals

class DefaultsTest {

  @Test
  fun testDefaultStroke() {
    val basicStrokeData = BasicStroke().toBasicStrokeData()

    assertEquals(
      basicStrokeData,
      Defaults.STROKE,
      "Default BasicStroke ($basicStrokeData) must be equal to the common default stroke (${Defaults.STROKE})"
    )
  }
}
