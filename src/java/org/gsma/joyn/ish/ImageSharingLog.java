/*******************************************************************************
 * Software Name : RCS IMS Stack
 *
 * Copyright (C) 2010 France Telecom S.A.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 ******************************************************************************/
package org.gsma.joyn.ish;

import android.net.Uri;

/**
 * Content provider for image sharing history
 *
 * @author Jean-Marc AUFFRET
 */
public class ImageSharingLog {
    /**
     * Content provider URI
     */
    public static final Uri CONTENT_URI = Uri.parse("content://org.gsma.joyn.provider.ish/ish");

    /**
     * The name of the column containing the unique ID for a row.
     * <P>Type: primary key</P>
     */
    public static final String ID = "_id";

    /**
     * The name of the column containing the unique ID of the image sharing.
     * <P>Type: TEXT</P>
     */
    public static final String SHARING_ID = "sharing_id";

    /**
     * The name of the column containing the MSISDN of the sender.
     * <P>Type: TEXT</P>
     */
    public static final String CONTACT_NUMBER = "contact_number";

    /**
     * The name of the column containing the filename (absolute path).
     * <P>Type: TEXT</P>
     */
    public static final String FILENAME = "filename";

    /**
     * The name of the column containing the image size to be transferred (in bytes).
     * <P>Type: LONG</P>
     */
    public static final String FILESIZE = "filesize";

    /**
     * The name of the column containing the MIME-type of the file.
     * <P>Type: TEXT</P>
     */
    public static final String MIME_TYPE = "mime_type";

    /**
     * The name of the column containing the direction of the sharing.
     * <P>Type: INTEGER</P>
     * @see ImageSharing.Direction
     */
    public static final String DIRECTION = "direction";

    /**
     * The name of the column containing the amount of data transferred (in bytes).
     * <P>Type: LONG</P>
     */
    public static final String TRANSFERRED = "transferred";

    /**
     * The name of the column containing the date of the sharing (in milliseconds).
     * <P>Type: LONG</P>
     */
    public static final String TIMESTAMP = "timestamp";

    /**
     * The name of the column containing the state of the sharing.
     * <P>Type: INTEGER</P>
     * @see ImageSharing.State
     */
    public static final String STATE = "state";
}
