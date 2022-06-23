package io.github.rosemoe.msgRenderer

import java.awt.Color
import java.awt.Font

data class RenderParams(
    /**
     * The width limitation for a single message piece. This includes the space of margins,
     * avatar, nickname and title
     */
    var widthLimit: Int = 700,
    /**
     * The width of image generated when using [MessageRenderer.renderMessages]
     */
    var multiMsgWidth: Int = 1000,
    /**
     * The width and height of avatar
     */
    var avatarSize: Int = 64,
    /**
     * Typeface for nicknames
     */
    var nicknameTypeface: Font = defaultFont.deriveFont(17f),
    /**
     * Typeface for title texts
     */
    var titleTypeface: Font = defaultFont.deriveFont(16f),
    /**
     * Typeface for message content
     */
    var messageTypeface: Font = defaultFont.deriveFont(19f),
    /**
     * Margin commonly used in whole image
     */
    var commonMargin: Int = 20,
    /**
     * Draw the avatar in a round rectangle
     */
    var roundAvatar: Boolean = true,
    /**
     * The max width for a single image
     */
    var imageMaxWidth: Int = 400,
    var titleBadgePadding: Int = 3,
    // Colors
    var nicknameColor: Color = Color.BLACK,
    var sentMessageTextColor: Color = Color.WHITE,
    var receivedMessageTextColor: Color = Color.BLACK,
    var atTextColor: Color = Color.BLUE,
    var backgroundColor: Color = Color.WHITE,
    var balloonSendColor: Color = Color(0, 99, 255, 99),
    var balloonReceiveColor: Color = Color(0xde, 0xde, 0xde),
    var titleTextColor: Color = Color.WHITE,
    var titleBadgeColor: Color = Color(55, 76, 228)
)
