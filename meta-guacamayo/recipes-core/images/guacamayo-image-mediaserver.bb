DESCRIPTION = "For us to know and for you to wonder ..."
LICENSE = "MIT"

LIC_FILES_CHKSUM = "file://${THISDIR}/../../COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

PR = "r1"

GUACAMAYO_FEATURES =+ "\
		      package-management \
		      guacamayo-server \
		      guacamayo-restricted \
		      "

inherit guacamayo-image

IMAGE_INSTALL += "guacamayo-session-mediaserver"

GUACA_DEMOS_FEATURE = "${@base_contains("IMAGE_FEATURES", "guacamayo-demos", "task-guacamayo-demos-audio task-guacamayo-demos-video task-guacamayo-demos-pictures", "", d)}"
IMAGE_INSTALL += "${GUACA_DEMOS_FEATURE}"
