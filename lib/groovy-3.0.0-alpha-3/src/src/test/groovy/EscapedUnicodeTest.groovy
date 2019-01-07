/*
 *  Licensed to the Apache Software Foundation (ASF) under one
 *  or more contributor license agreements.  See the NOTICE file
 *  distributed with this work for additional information
 *  regarding copyright ownership.  The ASF licenses this file
 *  to you under the Apache License, Version 2.0 (the
 *  "License"); you may not use this file except in compliance
 *  with the License.  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied.  See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package groovy

class EscapedUnicodeTest extends GroovyTestCase {
    void testNothing() {}
}

/*
\u0063\u006c\u0061\u0073\u0073\u0020\u0045\u0073\u0063\u0061\u0070\u0065\u0064\u0055\u006e\u0069\u0063\u006f\u0064\u0065\u0054\u0065\u0073\u0074\u0020\u0065\u0078\u0074\u0065\u006e\u0064\u0073\u0020\u0047\u0072\u006f\u006f\u0076\u0079\u0054\u0065\u0073\u0074\u0043\u0061\u0073\u0065\u0020\u007b

\u0020\u0020\u0020\u0020\u0076\u006f\u0069\u0064\u0020\u0074\u0065\u0073\u0074\u0041\u0073\u0073\u0065\u0072\u0074\u0028\u0029\u0020\u007b
\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0064\u0065\u0066\u0020\u0078\u0020\u003d\u0020\u0022\u0061\u0062\u0063\u0022

\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0061\u0073\u0073\u0065\u0072\u0074\u0020\u0078\u0020\u0021\u003d\u0020\u0022\u0066\u006f\u006f\u0022
\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0061\u0073\u0073\u0065\u0072\u0074\u0020\u0078\u0020\u0021\u003d\u0020\u0020\u006e\u0075\u006c\u006c
\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0061\u0073\u0073\u0065\u0072\u0074\u0020\u0078\u0020\u0021\u003d\u0020\u0022\u0064\u0065\u0066\u0022
\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0061\u0073\u0073\u0065\u0072\u0074\u0020\u0078\u0020\u003d\u003d\u0020\u0022\u0061\u0062\u0063\u0022
\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020
\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0061\u0073\u0073\u0065\u0072\u0074\u0020\u0078\u002e\u0065\u0071\u0075\u0061\u006c\u0073\u0028\u0022\u0061\u0062\u0063\u0022\u0029
\u0009\u007d
\u0020\u0020\u0020\u0020
\u0020\u0020\u0020\u0020\u0076\u006f\u0069\u0064\u0020\u0074\u0065\u0073\u0074\u0055\u006e\u006b\u006e\u006f\u0077\u006e\u0056\u0061\u0072\u0069\u0061\u0062\u006c\u0065\u0028\u0029\u0020\u007b
\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0074\u0072\u0079\u0020\u007b
\u0009\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0064\u0065\u0066\u0020\u0079\u0020\u003d\u0020\u0074\u0068\u0069\u0073\u002e\u0078
\u0009\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0066\u0061\u0069\u006c\u0028\u0022\u0078\u0020\u0069\u0073\u0020\u0075\u006e\u0064\u0065\u0066\u0069\u006e\u0065\u0064\u002c\u0020\u0073\u0068\u006f\u0075\u006c\u0064\u0020\u0074\u0068\u0072\u006f\u0077\u0020\u0061\u006e\u0020\u0065\u0078\u0063\u0065\u0070\u0074\u0069\u006f\u006e\u0022\u0029
\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u007d
\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0063\u0061\u0074\u0063\u0068\u0020\u0028\u004d\u0069\u0073\u0073\u0069\u006e\u0067\u0050\u0072\u006f\u0070\u0065\u0072\u0074\u0079\u0045\u0078\u0063\u0065\u0070\u0074\u0069\u006f\u006e\u0020\u0065\u0029\u0020\u007b
\u0009\u0009\u0009\u0061\u0073\u0073\u0065\u0072\u0074\u0020\u0065\u002e\u0067\u0065\u0074\u0050\u0072\u006f\u0070\u0065\u0072\u0074\u0079\u0028\u0029\u0020\u003d\u003d\u0020\u0022\u0078\u0022\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020
\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0064\u0065\u0066\u0020\u0074\u0065\u0078\u0074\u0020\u003d\u0020\u0065\u002e\u006d\u0065\u0073\u0073\u0061\u0067\u0065
\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0061\u0073\u0073\u0065\u0072\u0074\u0020\u0074\u0065\u0078\u0074\u0020\u003d\u003d\u0020\u0022\u004e\u006f\u0020\u0073\u0075\u0063\u0068\u0020\u0070\u0072\u006f\u0070\u0065\u0072\u0074\u0079\u003a\u0020\u0078\u0020\u0066\u006f\u0072\u0020\u0063\u006c\u0061\u0073\u0073\u003a\u0020\u0045\u0073\u0063\u0061\u0070\u0065\u0064\u0055\u006e\u0069\u0063\u006f\u0064\u0065\u0054\u0065\u0073\u0074\u0022
\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u0020\u007d
\u0020\u0020\u0020\u0020\u007d
\u0009\u0020\u0020\u0020\u0020
\u007d
*/
