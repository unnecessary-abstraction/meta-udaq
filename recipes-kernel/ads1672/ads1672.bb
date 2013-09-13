SUMMARY = "Device driver for ADS1672 connected via McBSP"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=d7810fab7487fb0aad327b76f1be7cd7"

inherit module

SRC_URI = "git://bitbucket.org/underwater-acoustics/ads1672.git;protocol=https"
SRCREV = "${AUTOREV}"
S = "${WORKDIR}/git"
PV = "git${SRCPV}"

MIRRORS = ""
PREMIRRORS = ""

do_configure () {
	unset CFLAGS CPPFLAGS CXXFLAGS LDFLAGS
	export KERNEL_SRCDIR="${STAGING_KERNEL_DIR}"
	export KERNEL_CC="${KERNEL_CC}"
	export KERNEL_LD="${KERNEL_LD}"
	export KERNEL_AR="${KERNEL_AR}"
	${S}/configure --prefix=/usr
}

do_compile () {
	unset CFLAGS CPPFLAGS CXXFLAGS LDFLAGS
	oe_runmake
}

do_install () {
        unset CFLAGS CPPFLAGS CXXFLAGS LDFLAGS
        oe_runmake DEPMOD=echo DESTDIR="${D}" install
}

FILES_${PN} = "/usr/sbin /usr/bin"
FILES_${PN}-dev = "/usr/include"
