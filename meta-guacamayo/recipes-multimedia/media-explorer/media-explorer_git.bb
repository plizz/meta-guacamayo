
include media-explorer-0.5.inc

LIC_FILES_CHKSUM = "file://COPYING;md5=4fbd65380cdd255951079008b364516c \
                    file://mex/mex-main.c;beginline=6;endline=16;md5=5bc999bfc01d0dd6e29e336c7dd2f7d1"


SRCREV ?= "46da10167539ca051a460b02c4db7db7a37e9e39"
PV = "0.5.0+git${SRCPV}"

SRC_URI = "git://github.com/Guacamayo/media-explorer.git;protocol=git \
	  "

S = "${WORKDIR}/git"

PR = "${INCPR}.4"

