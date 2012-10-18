package android.opengl;
class Visibility {
}
class Matrix {
  int sTemp;
}
class ManagedEGLContext {
  int mContext;
  int sActive;
  int TAG;
}
class GLWrapperBase {
  int mgl11ExtensionPack;
  int mgl11Ext;
  int mgl11;
  int mgl10Ext;
  int mgl;
}
class GLWallpaperService {
}
class GLUtils {
}
class GLU {
  int sScratch;
}
class GLSurfaceView {
  int mPreserveEGLContextOnPause;
  int mEGLContextClientVersion;
  int mDebugFlags;
  int mGLWrapper;
  int mEGLWindowSurfaceFactory;
  int mEGLContextFactory;
  int mEGLConfigChooser;
  int mDetached;
  int mRenderer;
  int mGLThread;
  int mThisWeakRef;
  int sGLThreadManager;
  class GLThreadManager {
    int mEglOwner;
    int kMSM7K_RENDERER_PREFIX;
    int kGLES_20;
    int mLimitedGLESContexts;
    int mMultipleGLESContextsAllowed;
    int mGLESDriverCheckComplete;
    int mGLESVersion;
    int mGLESVersionCheckComplete;
    int TAG;
  }
  class LogWriter {
    int mBuilder;
  }
  class GLThread {
    int mGLSurfaceViewWeakRef;
    int mEglHelper;
    int mSizeChanged;
    int mEventQueue;
    int mRenderComplete;
    int mRequestRender;
    int mRenderMode;
    int mHeight;
    int mWidth;
    int mShouldReleaseEglContext;
    int mHaveEglSurface;
    int mHaveEglContext;
    int mWaitingForSurface;
    int mSurfaceIsBad;
    int mHasSurface;
    int mPaused;
    int mRequestPaused;
    int mExited;
    int mShouldExit;
  }
  class EglHelper {
    int mEglContext;
    int mEglConfig;
    int mEglSurface;
    int mEglDisplay;
    int mEgl;
    int mGLSurfaceViewWeakRef;
  }
  class SimpleEGLConfigChooser {
  }
  class ComponentSizeChooser {
    int mStencilSize;
    int mDepthSize;
    int mAlphaSize;
    int mBlueSize;
    int mGreenSize;
    int mRedSize;
    int mValue;
  }
  class BaseConfigChooser {
    int mConfigSpec;
  }
  class EGLConfigChooser {
  }
  class DefaultWindowSurfaceFactory {
  }
  class EGLWindowSurfaceFactory {
  }
  class DefaultContextFactory {
    int EGL_CONTEXT_CLIENT_VERSION;
  }
  class EGLContextFactory {
  }
  class Renderer {
  }
  class GLWrapper {
  }
  int DEBUG_LOG_GL_CALLS;
  int DEBUG_CHECK_GL_ERROR;
  int RENDERMODE_CONTINUOUSLY;
  int RENDERMODE_WHEN_DIRTY;
  int LOG_EGL;
  int LOG_RENDERER_DRAW_FRAME;
  int LOG_RENDERER;
  int LOG_SURFACE;
  int LOG_PAUSE_RESUME;
  int LOG_THREADS;
  int LOG_ATTACH_DETACH;
  int TAG;
}
class GLLogWrapper {
  int mStringBuilder;
  int mVertexArrayEnabled;
  int mTextureCoordArrayEnabled;
  int mNormalArrayEnabled;
  int mColorArrayEnabled;
  int mVertexPointer;
  int mTexCoordPointer;
  int mNormalPointer;
  int mColorPointer;
  int mArgCount;
  int mLogArgumentNames;
  int mLog;
  class PointerInfo {
    int mTempByteBuffer;
    int mPointer;
    int mStride;
    int mType;
    int mSize;
  }
  int FORMAT_FIXED;
  int FORMAT_FLOAT;
  int FORMAT_INT;
}
class GLException {
  int mError;
}
class GLErrorWrapper {
  int mOurThread;
  int mCheckThread;
  int mCheckError;
}
class GLES20 {
  int GL_INVALID_FRAMEBUFFER_OPERATION;
  int GL_MAX_RENDERBUFFER_SIZE;
  int GL_RENDERBUFFER_BINDING;
  int GL_FRAMEBUFFER_BINDING;
  int GL_FRAMEBUFFER_UNSUPPORTED;
  int GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS;
  int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT;
  int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT;
  int GL_FRAMEBUFFER_COMPLETE;
  int GL_NONE;
  int GL_STENCIL_ATTACHMENT;
  int GL_DEPTH_ATTACHMENT;
  int GL_COLOR_ATTACHMENT0;
  int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE;
  int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL;
  int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME;
  int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE;
  int GL_RENDERBUFFER_STENCIL_SIZE;
  int GL_RENDERBUFFER_DEPTH_SIZE;
  int GL_RENDERBUFFER_ALPHA_SIZE;
  int GL_RENDERBUFFER_BLUE_SIZE;
  int GL_RENDERBUFFER_GREEN_SIZE;
  int GL_RENDERBUFFER_RED_SIZE;
  int GL_RENDERBUFFER_INTERNAL_FORMAT;
  int GL_RENDERBUFFER_HEIGHT;
  int GL_RENDERBUFFER_WIDTH;
  int GL_STENCIL_INDEX8;
  int GL_STENCIL_INDEX;
  int GL_DEPTH_COMPONENT16;
  int GL_RGB565;
  int GL_RGB5_A1;
  int GL_RGBA4;
  int GL_RENDERBUFFER;
  int GL_FRAMEBUFFER;
  int GL_HIGH_INT;
  int GL_MEDIUM_INT;
  int GL_LOW_INT;
  int GL_HIGH_FLOAT;
  int GL_MEDIUM_FLOAT;
  int GL_LOW_FLOAT;
  int GL_NUM_SHADER_BINARY_FORMATS;
  int GL_SHADER_BINARY_FORMATS;
  int GL_SHADER_COMPILER;
  int GL_SHADER_SOURCE_LENGTH;
  int GL_INFO_LOG_LENGTH;
  int GL_COMPILE_STATUS;
  int GL_IMPLEMENTATION_COLOR_READ_FORMAT;
  int GL_IMPLEMENTATION_COLOR_READ_TYPE;
  int GL_VERTEX_ATTRIB_ARRAY_BUFFER_BINDING;
  int GL_VERTEX_ATTRIB_ARRAY_POINTER;
  int GL_VERTEX_ATTRIB_ARRAY_NORMALIZED;
  int GL_VERTEX_ATTRIB_ARRAY_TYPE;
  int GL_VERTEX_ATTRIB_ARRAY_STRIDE;
  int GL_VERTEX_ATTRIB_ARRAY_SIZE;
  int GL_VERTEX_ATTRIB_ARRAY_ENABLED;
  int GL_SAMPLER_CUBE;
  int GL_SAMPLER_2D;
  int GL_FLOAT_MAT4;
  int GL_FLOAT_MAT3;
  int GL_FLOAT_MAT2;
  int GL_BOOL_VEC4;
  int GL_BOOL_VEC3;
  int GL_BOOL_VEC2;
  int GL_BOOL;
  int GL_INT_VEC4;
  int GL_INT_VEC3;
  int GL_INT_VEC2;
  int GL_FLOAT_VEC4;
  int GL_FLOAT_VEC3;
  int GL_FLOAT_VEC2;
  int GL_MIRRORED_REPEAT;
  int GL_CLAMP_TO_EDGE;
  int GL_REPEAT;
  int GL_TEXTURE31;
  int GL_TEXTURE30;
  int GL_TEXTURE29;
  int GL_TEXTURE28;
  int GL_TEXTURE27;
  int GL_TEXTURE26;
  int GL_TEXTURE25;
  int GL_TEXTURE24;
  int GL_TEXTURE23;
  int GL_TEXTURE22;
  int GL_TEXTURE21;
  int GL_TEXTURE20;
  int GL_TEXTURE19;
  int GL_TEXTURE18;
  int GL_TEXTURE17;
  int GL_TEXTURE16;
  int GL_TEXTURE15;
  int GL_TEXTURE14;
  int GL_TEXTURE13;
  int GL_TEXTURE12;
  int GL_TEXTURE11;
  int GL_TEXTURE10;
  int GL_TEXTURE9;
  int GL_TEXTURE8;
  int GL_TEXTURE7;
  int GL_TEXTURE6;
  int GL_TEXTURE5;
  int GL_TEXTURE4;
  int GL_TEXTURE3;
  int GL_TEXTURE2;
  int GL_TEXTURE1;
  int GL_TEXTURE0;
  int GL_MAX_CUBE_MAP_TEXTURE_SIZE;
  int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z;
  int GL_TEXTURE_CUBE_MAP_POSITIVE_Z;
  int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y;
  int GL_TEXTURE_CUBE_MAP_POSITIVE_Y;
  int GL_TEXTURE_CUBE_MAP_NEGATIVE_X;
  int GL_TEXTURE_CUBE_MAP_POSITIVE_X;
  int GL_TEXTURE_BINDING_CUBE_MAP;
  int GL_TEXTURE_CUBE_MAP;
  int GL_TEXTURE;
  int GL_TEXTURE_WRAP_T;
  int GL_TEXTURE_WRAP_S;
  int GL_TEXTURE_MIN_FILTER;
  int GL_TEXTURE_MAG_FILTER;
  int GL_LINEAR_MIPMAP_LINEAR;
  int GL_NEAREST_MIPMAP_LINEAR;
  int GL_LINEAR_MIPMAP_NEAREST;
  int GL_NEAREST_MIPMAP_NEAREST;
  int GL_LINEAR;
  int GL_NEAREST;
  int GL_EXTENSIONS;
  int GL_VERSION;
  int GL_RENDERER;
  int GL_VENDOR;
  int GL_DECR_WRAP;
  int GL_INCR_WRAP;
  int GL_INVERT;
  int GL_DECR;
  int GL_INCR;
  int GL_REPLACE;
  int GL_KEEP;
  int GL_ALWAYS;
  int GL_GEQUAL;
  int GL_NOTEQUAL;
  int GL_GREATER;
  int GL_LEQUAL;
  int GL_EQUAL;
  int GL_LESS;
  int GL_NEVER;
  int GL_CURRENT_PROGRAM;
  int GL_SHADING_LANGUAGE_VERSION;
  int GL_ACTIVE_ATTRIBUTE_MAX_LENGTH;
  int GL_ACTIVE_ATTRIBUTES;
  int GL_ACTIVE_UNIFORM_MAX_LENGTH;
  int GL_ACTIVE_UNIFORMS;
  int GL_ATTACHED_SHADERS;
  int GL_VALIDATE_STATUS;
  int GL_LINK_STATUS;
  int GL_DELETE_STATUS;
  int GL_SHADER_TYPE;
  int GL_MAX_FRAGMENT_UNIFORM_VECTORS;
  int GL_MAX_TEXTURE_IMAGE_UNITS;
  int GL_MAX_VERTEX_TEXTURE_IMAGE_UNITS;
  int GL_MAX_COMBINED_TEXTURE_IMAGE_UNITS;
  int GL_MAX_VARYING_VECTORS;
  int GL_MAX_VERTEX_UNIFORM_VECTORS;
  int GL_MAX_VERTEX_ATTRIBS;
  int GL_VERTEX_SHADER;
  int GL_FRAGMENT_SHADER;
  int GL_UNSIGNED_SHORT_5_6_5;
  int GL_UNSIGNED_SHORT_5_5_5_1;
  int GL_UNSIGNED_SHORT_4_4_4_4;
  int GL_LUMINANCE_ALPHA;
  int GL_LUMINANCE;
  int GL_RGBA;
  int GL_RGB;
  int GL_ALPHA;
  int GL_DEPTH_COMPONENT;
  int GL_FIXED;
  int GL_FLOAT;
  int GL_UNSIGNED_INT;
  int GL_INT;
  int GL_UNSIGNED_SHORT;
  int GL_SHORT;
  int GL_UNSIGNED_BYTE;
  int GL_BYTE;
  int GL_GENERATE_MIPMAP_HINT;
  int GL_NICEST;
  int GL_FASTEST;
  int GL_DONT_CARE;
  int GL_COMPRESSED_TEXTURE_FORMATS;
  int GL_NUM_COMPRESSED_TEXTURE_FORMATS;
  int GL_SAMPLE_COVERAGE_INVERT;
  int GL_SAMPLE_COVERAGE_VALUE;
  int GL_SAMPLES;
  int GL_SAMPLE_BUFFERS;
  int GL_TEXTURE_BINDING_2D;
  int GL_POLYGON_OFFSET_FACTOR;
  int GL_POLYGON_OFFSET_UNITS;
  int GL_STENCIL_BITS;
  int GL_DEPTH_BITS;
  int GL_ALPHA_BITS;
  int GL_BLUE_BITS;
  int GL_GREEN_BITS;
  int GL_RED_BITS;
  int GL_SUBPIXEL_BITS;
  int GL_MAX_VIEWPORT_DIMS;
  int GL_MAX_TEXTURE_SIZE;
  int GL_PACK_ALIGNMENT;
  int GL_UNPACK_ALIGNMENT;
  int GL_COLOR_WRITEMASK;
  int GL_COLOR_CLEAR_VALUE;
  int GL_SCISSOR_BOX;
  int GL_VIEWPORT;
  int GL_STENCIL_BACK_WRITEMASK;
  int GL_STENCIL_BACK_VALUE_MASK;
  int GL_STENCIL_BACK_REF;
  int GL_STENCIL_BACK_PASS_DEPTH_PASS;
  int GL_STENCIL_BACK_PASS_DEPTH_FAIL;
  int GL_STENCIL_BACK_FAIL;
  int GL_STENCIL_BACK_FUNC;
  int GL_STENCIL_WRITEMASK;
  int GL_STENCIL_VALUE_MASK;
  int GL_STENCIL_REF;
  int GL_STENCIL_PASS_DEPTH_PASS;
  int GL_STENCIL_PASS_DEPTH_FAIL;
  int GL_STENCIL_FAIL;
  int GL_STENCIL_FUNC;
  int GL_STENCIL_CLEAR_VALUE;
  int GL_DEPTH_FUNC;
  int GL_DEPTH_CLEAR_VALUE;
  int GL_DEPTH_WRITEMASK;
  int GL_DEPTH_RANGE;
  int GL_FRONT_FACE;
  int GL_CULL_FACE_MODE;
  int GL_ALIASED_LINE_WIDTH_RANGE;
  int GL_ALIASED_POINT_SIZE_RANGE;
  int GL_LINE_WIDTH;
  int GL_CCW;
  int GL_CW;
  int GL_OUT_OF_MEMORY;
  int GL_INVALID_OPERATION;
  int GL_INVALID_VALUE;
  int GL_INVALID_ENUM;
  int GL_NO_ERROR;
  int GL_SAMPLE_COVERAGE;
  int GL_SAMPLE_ALPHA_TO_COVERAGE;
  int GL_POLYGON_OFFSET_FILL;
  int GL_SCISSOR_TEST;
  int GL_DEPTH_TEST;
  int GL_STENCIL_TEST;
  int GL_DITHER;
  int GL_BLEND;
  int GL_CULL_FACE;
  int GL_TEXTURE_2D;
  int GL_FRONT_AND_BACK;
  int GL_BACK;
  int GL_FRONT;
  int GL_CURRENT_VERTEX_ATTRIB;
  int GL_BUFFER_USAGE;
  int GL_BUFFER_SIZE;
  int GL_DYNAMIC_DRAW;
  int GL_STATIC_DRAW;
  int GL_STREAM_DRAW;
  int GL_ELEMENT_ARRAY_BUFFER_BINDING;
  int GL_ARRAY_BUFFER_BINDING;
  int GL_ELEMENT_ARRAY_BUFFER;
  int GL_ARRAY_BUFFER;
  int GL_BLEND_COLOR;
  int GL_ONE_MINUS_CONSTANT_ALPHA;
  int GL_CONSTANT_ALPHA;
  int GL_ONE_MINUS_CONSTANT_COLOR;
  int GL_CONSTANT_COLOR;
  int GL_BLEND_SRC_ALPHA;
  int GL_BLEND_DST_ALPHA;
  int GL_BLEND_SRC_RGB;
  int GL_BLEND_DST_RGB;
  int GL_FUNC_REVERSE_SUBTRACT;
  int GL_FUNC_SUBTRACT;
  int GL_BLEND_EQUATION_ALPHA;
  int GL_BLEND_EQUATION_RGB;
  int GL_BLEND_EQUATION;
  int GL_FUNC_ADD;
  int GL_SRC_ALPHA_SATURATE;
  int GL_ONE_MINUS_DST_COLOR;
  int GL_DST_COLOR;
  int GL_ONE_MINUS_DST_ALPHA;
  int GL_DST_ALPHA;
  int GL_ONE_MINUS_SRC_ALPHA;
  int GL_SRC_ALPHA;
  int GL_ONE_MINUS_SRC_COLOR;
  int GL_SRC_COLOR;
  int GL_ONE;
  int GL_ZERO;
  int GL_TRIANGLE_FAN;
  int GL_TRIANGLE_STRIP;
  int GL_TRIANGLES;
  int GL_LINE_STRIP;
  int GL_LINE_LOOP;
  int GL_LINES;
  int GL_POINTS;
  int GL_TRUE;
  int GL_FALSE;
  int GL_COLOR_BUFFER_BIT;
  int GL_STENCIL_BUFFER_BIT;
  int GL_DEPTH_BUFFER_BIT;
  int GL_ACTIVE_TEXTURE;
}
class GLES11Ext {
  int _matrixIndexPointerOES;
  int GL_SHORT;
  int GL_FLOAT;
  int GL_FIXED;
  int GL_BYTE;
  int GL_REQUIRED_TEXTURE_IMAGE_UNITS_OES;
  int GL_TEXTURE_BINDING_EXTERNAL_OES;
  int GL_SAMPLER_EXTERNAL_OES;
  int GL_TEXTURE_EXTERNAL_OES;
  int GL_BGRA;
  int GL_MAX_TEXTURE_MAX_ANISOTROPY_EXT;
  int GL_TEXTURE_MAX_ANISOTROPY_EXT;
  int GL_ATC_RGBA_INTERPOLATED_ALPHA_AMD;
  int GL_ATC_RGBA_EXPLICIT_ALPHA_AMD;
  int GL_ATC_RGB_AMD;
  int GL_3DC_XY_AMD;
  int GL_3DC_X_AMD;
  int GL_MIRRORED_REPEAT_OES;
  int GL_TEXTURE_GEN_STR_OES;
  int GL_TEXTURE_GEN_MODE_OES;
  int GL_MAX_CUBE_MAP_TEXTURE_SIZE_OES;
  int GL_TEXTURE_CUBE_MAP_NEGATIVE_Z_OES;
  int GL_TEXTURE_CUBE_MAP_POSITIVE_Z_OES;
  int GL_TEXTURE_CUBE_MAP_NEGATIVE_Y_OES;
  int GL_TEXTURE_CUBE_MAP_POSITIVE_Y_OES;
  int GL_TEXTURE_CUBE_MAP_NEGATIVE_X_OES;
  int GL_TEXTURE_CUBE_MAP_POSITIVE_X_OES;
  int GL_TEXTURE_BINDING_CUBE_MAP_OES;
  int GL_TEXTURE_CUBE_MAP_OES;
  int GL_REFLECTION_MAP_OES;
  int GL_NORMAL_MAP_OES;
  int GL_DECR_WRAP_OES;
  int GL_INCR_WRAP_OES;
  int GL_STENCIL_INDEX8_OES;
  int GL_STENCIL_INDEX4_OES;
  int GL_STENCIL_INDEX1_OES;
  int GL_RGBA8_OES;
  int GL_RGB8_OES;
  int GL_DEPTH24_STENCIL8_OES;
  int GL_UNSIGNED_INT_24_8_OES;
  int GL_DEPTH_STENCIL_OES;
  int GL_WEIGHT_ARRAY_BUFFER_BINDING_OES;
  int GL_WEIGHT_ARRAY_POINTER_OES;
  int GL_WEIGHT_ARRAY_STRIDE_OES;
  int GL_WEIGHT_ARRAY_TYPE_OES;
  int GL_WEIGHT_ARRAY_SIZE_OES;
  int GL_MATRIX_INDEX_ARRAY_BUFFER_BINDING_OES;
  int GL_MATRIX_INDEX_ARRAY_POINTER_OES;
  int GL_MATRIX_INDEX_ARRAY_STRIDE_OES;
  int GL_MATRIX_INDEX_ARRAY_TYPE_OES;
  int GL_MATRIX_INDEX_ARRAY_SIZE_OES;
  int GL_CURRENT_PALETTE_MATRIX_OES;
  int GL_WEIGHT_ARRAY_OES;
  int GL_MATRIX_INDEX_ARRAY_OES;
  int GL_MATRIX_PALETTE_OES;
  int GL_MAX_PALETTE_MATRICES_OES;
  int GL_MAX_VERTEX_UNITS_OES;
  int GL_TEXTURE_MATRIX_FLOAT_AS_INT_BITS_OES;
  int GL_PROJECTION_MATRIX_FLOAT_AS_INT_BITS_OES;
  int GL_MODELVIEW_MATRIX_FLOAT_AS_INT_BITS_OES;
  int GL_BUFFER_MAP_POINTER_OES;
  int GL_BUFFER_MAPPED_OES;
  int GL_BUFFER_ACCESS_OES;
  int GL_WRITE_ONLY_OES;
  int GL_INVALID_FRAMEBUFFER_OPERATION_OES;
  int GL_MAX_RENDERBUFFER_SIZE_OES;
  int GL_RENDERBUFFER_BINDING_OES;
  int GL_FRAMEBUFFER_BINDING_OES;
  int GL_FRAMEBUFFER_UNSUPPORTED_OES;
  int GL_FRAMEBUFFER_INCOMPLETE_FORMATS_OES;
  int GL_FRAMEBUFFER_INCOMPLETE_DIMENSIONS_OES;
  int GL_FRAMEBUFFER_INCOMPLETE_MISSING_ATTACHMENT_OES;
  int GL_FRAMEBUFFER_INCOMPLETE_ATTACHMENT_OES;
  int GL_FRAMEBUFFER_COMPLETE_OES;
  int GL_STENCIL_ATTACHMENT_OES;
  int GL_DEPTH_ATTACHMENT_OES;
  int GL_COLOR_ATTACHMENT0_OES;
  int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_CUBE_MAP_FACE_OES;
  int GL_FRAMEBUFFER_ATTACHMENT_TEXTURE_LEVEL_OES;
  int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_NAME_OES;
  int GL_FRAMEBUFFER_ATTACHMENT_OBJECT_TYPE_OES;
  int GL_RENDERBUFFER_STENCIL_SIZE_OES;
  int GL_RENDERBUFFER_DEPTH_SIZE_OES;
  int GL_RENDERBUFFER_ALPHA_SIZE_OES;
  int GL_RENDERBUFFER_BLUE_SIZE_OES;
  int GL_RENDERBUFFER_GREEN_SIZE_OES;
  int GL_RENDERBUFFER_RED_SIZE_OES;
  int GL_RENDERBUFFER_INTERNAL_FORMAT_OES;
  int GL_RENDERBUFFER_HEIGHT_OES;
  int GL_RENDERBUFFER_WIDTH_OES;
  int GL_DEPTH_COMPONENT16_OES;
  int GL_RGB565_OES;
  int GL_RGB5_A1_OES;
  int GL_RGBA4_OES;
  int GL_RENDERBUFFER_OES;
  int GL_FRAMEBUFFER_OES;
  int GL_NONE_OES;
  int GL_FIXED_OES;
  int GL_TEXTURE_CROP_RECT_OES;
  int GL_DEPTH_COMPONENT32_OES;
  int GL_DEPTH_COMPONENT24_OES;
  int GL_ETC1_RGB8_OES;
  int GL_FUNC_REVERSE_SUBTRACT_OES;
  int GL_FUNC_SUBTRACT_OES;
  int GL_FUNC_ADD_OES;
  int GL_BLEND_EQUATION_OES;
  int GL_BLEND_SRC_ALPHA_OES;
  int GL_BLEND_DST_ALPHA_OES;
  int GL_BLEND_SRC_RGB_OES;
  int GL_BLEND_DST_RGB_OES;
  int GL_BLEND_EQUATION_ALPHA_OES;
  int GL_BLEND_EQUATION_RGB_OES;
}
class GLES11 {
  int _pointSizePointerOES;
  int GL_WRITE_ONLY;
  int GL_VIEWPORT;
  int GL_VERTEX_ARRAY_TYPE;
  int GL_VERTEX_ARRAY_STRIDE;
  int GL_VERTEX_ARRAY_SIZE;
  int GL_VERTEX_ARRAY_POINTER;
  int GL_VERTEX_ARRAY_BUFFER_BINDING;
  int GL_TEXTURE_STACK_DEPTH;
  int GL_TEXTURE_MATRIX_FLOAT_AS_INT_BITS_OES;
  int GL_TEXTURE_MATRIX;
  int GL_TEXTURE_COORD_ARRAY_TYPE;
  int GL_TEXTURE_COORD_ARRAY_STRIDE;
  int GL_TEXTURE_COORD_ARRAY_SIZE;
  int GL_TEXTURE_COORD_ARRAY_POINTER;
  int GL_TEXTURE_COORD_ARRAY_BUFFER_BINDING;
  int GL_TEXTURE_BINDING_2D;
  int GL_SUBTRACT;
  int GL_STENCIL_WRITEMASK;
  int GL_STENCIL_VALUE_MASK;
  int GL_STENCIL_REF;
  int GL_STENCIL_PASS_DEPTH_PASS;
  int GL_STENCIL_PASS_DEPTH_FAIL;
  int GL_STENCIL_FUNC;
  int GL_STENCIL_FAIL;
  int GL_STENCIL_CLEAR_VALUE;
  int GL_STATIC_DRAW;
  int GL_SRC2_RGB;
  int GL_SRC2_ALPHA;
  int GL_SRC1_RGB;
  int GL_SRC1_ALPHA;
  int GL_SRC0_RGB;
  int GL_SRC0_ALPHA;
  int GL_SHADE_MODEL;
  int GL_SCISSOR_BOX;
  int GL_SAMPLES;
  int GL_SAMPLE_COVERAGE_VALUE;
  int GL_SAMPLE_COVERAGE_INVERT;
  int GL_SAMPLE_BUFFERS;
  int GL_RGB_SCALE;
  int GL_PROJECTION_STACK_DEPTH;
  int GL_PROJECTION_MATRIX_FLOAT_AS_INT_BITS_OES;
  int GL_PROJECTION_MATRIX;
  int GL_PRIMARY_COLOR;
  int GL_PREVIOUS;
  int GL_POLYGON_OFFSET_UNITS;
  int GL_POLYGON_OFFSET_FACTOR;
  int GL_POINT_SPRITE_OES;
  int GL_POINT_SIZE_MIN;
  int GL_POINT_SIZE_MAX;
  int GL_POINT_SIZE_ARRAY_TYPE_OES;
  int GL_POINT_SIZE_ARRAY_STRIDE_OES;
  int GL_POINT_SIZE_ARRAY_POINTER_OES;
  int GL_POINT_SIZE_ARRAY_OES;
  int GL_POINT_SIZE_ARRAY_BUFFER_BINDING_OES;
  int GL_POINT_SIZE;
  int GL_POINT_FADE_THRESHOLD_SIZE;
  int GL_POINT_DISTANCE_ATTENUATION;
  int GL_OPERAND2_RGB;
  int GL_OPERAND2_ALPHA;
  int GL_OPERAND1_RGB;
  int GL_OPERAND1_ALPHA;
  int GL_OPERAND0_RGB;
  int GL_OPERAND0_ALPHA;
  int GL_NORMAL_ARRAY_TYPE;
  int GL_NORMAL_ARRAY_STRIDE;
  int GL_NORMAL_ARRAY_POINTER;
  int GL_NORMAL_ARRAY_BUFFER_BINDING;
  int GL_MODELVIEW_STACK_DEPTH;
  int GL_MODELVIEW_MATRIX_FLOAT_AS_INT_BITS_OES;
  int GL_MODELVIEW_MATRIX;
  int GL_MAX_CLIP_PLANES;
  int GL_MATRIX_MODE;
  int GL_LOGIC_OP_MODE;
  int GL_LINE_WIDTH;
  int GL_INTERPOLATE;
  int GL_GENERATE_MIPMAP_HINT;
  int GL_GENERATE_MIPMAP;
  int GL_FRONT_FACE;
  int GL_ELEMENT_ARRAY_BUFFER_BINDING;
  int GL_ELEMENT_ARRAY_BUFFER;
  int GL_DYNAMIC_DRAW;
  int GL_DOT3_RGBA;
  int GL_DOT3_RGB;
  int GL_DEPTH_WRITEMASK;
  int GL_DEPTH_RANGE;
  int GL_DEPTH_FUNC;
  int GL_DEPTH_CLEAR_VALUE;
  int GL_CURRENT_TEXTURE_COORDS;
  int GL_CURRENT_NORMAL;
  int GL_CURRENT_COLOR;
  int GL_CULL_FACE_MODE;
  int GL_COORD_REPLACE_OES;
  int GL_CONSTANT;
  int GL_COMBINE_RGB;
  int GL_COMBINE_ALPHA;
  int GL_COMBINE;
  int GL_COLOR_WRITEMASK;
  int GL_COLOR_CLEAR_VALUE;
  int GL_COLOR_ARRAY_TYPE;
  int GL_COLOR_ARRAY_STRIDE;
  int GL_COLOR_ARRAY_SIZE;
  int GL_COLOR_ARRAY_POINTER;
  int GL_COLOR_ARRAY_BUFFER_BINDING;
  int GL_CLIP_PLANE5;
  int GL_CLIP_PLANE4;
  int GL_CLIP_PLANE3;
  int GL_CLIP_PLANE2;
  int GL_CLIP_PLANE1;
  int GL_CLIP_PLANE0;
  int GL_CLIENT_ACTIVE_TEXTURE;
  int GL_BUFFER_USAGE;
  int GL_BUFFER_SIZE;
  int GL_BUFFER_ACCESS;
  int GL_BLEND_SRC;
  int GL_BLEND_DST;
  int GL_ARRAY_BUFFER_BINDING;
  int GL_ARRAY_BUFFER;
  int GL_ALPHA_TEST_REF;
  int GL_ALPHA_TEST_FUNC;
  int GL_ALPHA_SCALE;
  int GL_ADD_SIGNED;
  int GL_ACTIVE_TEXTURE;
}
class GLES10Ext {
}
class GLES10 {
  int _vertexPointer;
  int _texCoordPointer;
  int _normalPointer;
  int _colorPointer;
  int GL_ZERO;
  int GL_XOR;
  int GL_VERTEX_ARRAY;
  int GL_VERSION;
  int GL_VENDOR;
  int GL_UNSIGNED_SHORT_5_6_5;
  int GL_UNSIGNED_SHORT_5_5_5_1;
  int GL_UNSIGNED_SHORT_4_4_4_4;
  int GL_UNSIGNED_SHORT;
  int GL_UNSIGNED_BYTE;
  int GL_UNPACK_ALIGNMENT;
  int GL_TRUE;
  int GL_TRIANGLES;
  int GL_TRIANGLE_STRIP;
  int GL_TRIANGLE_FAN;
  int GL_TEXTURE31;
  int GL_TEXTURE30;
  int GL_TEXTURE29;
  int GL_TEXTURE28;
  int GL_TEXTURE27;
  int GL_TEXTURE26;
  int GL_TEXTURE25;
  int GL_TEXTURE24;
  int GL_TEXTURE23;
  int GL_TEXTURE22;
  int GL_TEXTURE21;
  int GL_TEXTURE20;
  int GL_TEXTURE19;
  int GL_TEXTURE18;
  int GL_TEXTURE17;
  int GL_TEXTURE16;
  int GL_TEXTURE15;
  int GL_TEXTURE14;
  int GL_TEXTURE13;
  int GL_TEXTURE12;
  int GL_TEXTURE11;
  int GL_TEXTURE10;
  int GL_TEXTURE9;
  int GL_TEXTURE8;
  int GL_TEXTURE7;
  int GL_TEXTURE6;
  int GL_TEXTURE5;
  int GL_TEXTURE4;
  int GL_TEXTURE3;
  int GL_TEXTURE2;
  int GL_TEXTURE1;
  int GL_TEXTURE0;
  int GL_TEXTURE_WRAP_T;
  int GL_TEXTURE_WRAP_S;
  int GL_TEXTURE_MIN_FILTER;
  int GL_TEXTURE_MAG_FILTER;
  int GL_TEXTURE_ENV_MODE;
  int GL_TEXTURE_ENV_COLOR;
  int GL_TEXTURE_ENV;
  int GL_TEXTURE_COORD_ARRAY;
  int GL_TEXTURE_2D;
  int GL_TEXTURE;
  int GL_SUBPIXEL_BITS;
  int GL_STENCIL_TEST;
  int GL_STENCIL_BUFFER_BIT;
  int GL_STENCIL_BITS;
  int GL_STACK_UNDERFLOW;
  int GL_STACK_OVERFLOW;
  int GL_SRC_COLOR;
  int GL_SRC_ALPHA_SATURATE;
  int GL_SRC_ALPHA;
  int GL_SPOT_EXPONENT;
  int GL_SPOT_DIRECTION;
  int GL_SPOT_CUTOFF;
  int GL_SPECULAR;
  int GL_SMOOTH_POINT_SIZE_RANGE;
  int GL_SMOOTH_LINE_WIDTH_RANGE;
  int GL_SMOOTH;
  int GL_SHORT;
  int GL_SHININESS;
  int GL_SET;
  int GL_SCISSOR_TEST;
  int GL_SAMPLE_COVERAGE;
  int GL_SAMPLE_ALPHA_TO_ONE;
  int GL_SAMPLE_ALPHA_TO_COVERAGE;
  int GL_RGBA;
  int GL_RGB;
  int GL_RESCALE_NORMAL;
  int GL_REPLACE;
  int GL_REPEAT;
  int GL_RENDERER;
  int GL_RED_BITS;
  int GL_QUADRATIC_ATTENUATION;
  int GL_PROJECTION;
  int GL_POSITION;
  int GL_POLYGON_SMOOTH_HINT;
  int GL_POLYGON_OFFSET_FILL;
  int GL_POINT_SIZE;
  int GL_POINT_FADE_THRESHOLD_SIZE;
  int GL_POINTS;
  int GL_POINT_SMOOTH_HINT;
  int GL_POINT_SMOOTH;
  int GL_PERSPECTIVE_CORRECTION_HINT;
  int GL_PALETTE8_RGBA8_OES;
  int GL_PALETTE8_RGBA4_OES;
  int GL_PALETTE8_RGB8_OES;
  int GL_PALETTE8_RGB5_A1_OES;
  int GL_PALETTE8_R5_G6_B5_OES;
  int GL_PALETTE4_RGBA8_OES;
  int GL_PALETTE4_RGBA4_OES;
  int GL_PALETTE4_RGB8_OES;
  int GL_PALETTE4_RGB5_A1_OES;
  int GL_PALETTE4_R5_G6_B5_OES;
  int GL_PACK_ALIGNMENT;
  int GL_OUT_OF_MEMORY;
  int GL_OR_REVERSE;
  int GL_OR_INVERTED;
  int GL_OR;
  int GL_ONE_MINUS_SRC_COLOR;
  int GL_ONE_MINUS_SRC_ALPHA;
  int GL_ONE_MINUS_DST_COLOR;
  int GL_ONE_MINUS_DST_ALPHA;
  int GL_ONE;
  int GL_NUM_COMPRESSED_TEXTURE_FORMATS;
  int GL_NOTEQUAL;
  int GL_NORMALIZE;
  int GL_NORMAL_ARRAY;
  int GL_NOR;
  int GL_NOOP;
  int GL_NO_ERROR;
  int GL_NICEST;
  int GL_NEVER;
  int GL_NEAREST_MIPMAP_NEAREST;
  int GL_NEAREST_MIPMAP_LINEAR;
  int GL_NEAREST;
  int GL_NAND;
  int GL_MULTISAMPLE;
  int GL_MODULATE;
  int GL_MODELVIEW;
  int GL_MAX_VIEWPORT_DIMS;
  int GL_MAX_TEXTURE_UNITS;
  int GL_MAX_TEXTURE_STACK_DEPTH;
  int GL_MAX_TEXTURE_SIZE;
  int GL_MAX_PROJECTION_STACK_DEPTH;
  int GL_MAX_MODELVIEW_STACK_DEPTH;
  int GL_MAX_LIGHTS;
  int GL_MAX_ELEMENTS_VERTICES;
  int GL_MAX_ELEMENTS_INDICES;
  int GL_LUMINANCE_ALPHA;
  int GL_LUMINANCE;
  int GL_LINES;
  int GL_LINEAR_MIPMAP_NEAREST;
  int GL_LINEAR_MIPMAP_LINEAR;
  int GL_LINEAR_ATTENUATION;
  int GL_LINEAR;
  int GL_LINE_STRIP;
  int GL_LINE_SMOOTH_HINT;
  int GL_LINE_SMOOTH;
  int GL_LINE_LOOP;
  int GL_LIGHTING;
  int GL_LIGHT7;
  int GL_LIGHT6;
  int GL_LIGHT5;
  int GL_LIGHT4;
  int GL_LIGHT3;
  int GL_LIGHT2;
  int GL_LIGHT1;
  int GL_LIGHT0;
  int GL_LIGHT_MODEL_TWO_SIDE;
  int GL_LIGHT_MODEL_AMBIENT;
  int GL_LESS;
  int GL_LEQUAL;
  int GL_KEEP;
  int GL_INVERT;
  int GL_INVALID_VALUE;
  int GL_INVALID_OPERATION;
  int GL_INVALID_ENUM;
  int GL_INCR;
  int GL_IMPLEMENTATION_COLOR_READ_TYPE_OES;
  int GL_IMPLEMENTATION_COLOR_READ_FORMAT_OES;
  int GL_GREEN_BITS;
  int GL_GREATER;
  int GL_GEQUAL;
  int GL_FRONT_AND_BACK;
  int GL_FRONT;
  int GL_FOG_START;
  int GL_FOG_MODE;
  int GL_FOG_HINT;
  int GL_FOG_END;
  int GL_FOG_DENSITY;
  int GL_FOG_COLOR;
  int GL_FOG;
  int GL_FLOAT;
  int GL_FLAT;
  int GL_FIXED;
  int GL_FASTEST;
  int GL_FALSE;
  int GL_EXTENSIONS;
  int GL_EXP2;
  int GL_EXP;
  int GL_EQUIV;
  int GL_EQUAL;
  int GL_EMISSION;
  int GL_DST_COLOR;
  int GL_DST_ALPHA;
  int GL_DONT_CARE;
  int GL_DITHER;
  int GL_DIFFUSE;
  int GL_DEPTH_TEST;
  int GL_DEPTH_BUFFER_BIT;
  int GL_DEPTH_BITS;
  int GL_DECR;
  int GL_DECAL;
  int GL_CW;
  int GL_CULL_FACE;
  int GL_COPY_INVERTED;
  int GL_COPY;
  int GL_CONSTANT_ATTENUATION;
  int GL_COMPRESSED_TEXTURE_FORMATS;
  int GL_COLOR_MATERIAL;
  int GL_COLOR_LOGIC_OP;
  int GL_COLOR_BUFFER_BIT;
  int GL_COLOR_ARRAY;
  int GL_CLEAR;
  int GL_CLAMP_TO_EDGE;
  int GL_CCW;
  int GL_BYTE;
  int GL_BLUE_BITS;
  int GL_BLEND;
  int GL_BACK;
  int GL_AND_REVERSE;
  int GL_AND_INVERTED;
  int GL_AND;
  int GL_AMBIENT_AND_DIFFUSE;
  int GL_AMBIENT;
  int GL_ALWAYS;
  int GL_ALPHA_TEST;
  int GL_ALPHA_BITS;
  int GL_ALPHA;
  int GL_ALIASED_POINT_SIZE_RANGE;
  int GL_ALIASED_LINE_WIDTH_RANGE;
  int GL_ADD;
}
class GLDebugHelper {
  int ERROR_WRONG_THREAD;
  int CONFIG_LOG_ARGUMENT_NAMES;
  int CONFIG_CHECK_THREAD;
  int CONFIG_CHECK_GL_ERROR;
}
class ETC1Util {
  class ETC1Texture {
    int mData;
    int mHeight;
    int mWidth;
  }
}
class ETC1 {
  int ETC1_RGB8_OES;
  int ETC_PKM_HEADER_SIZE;
  int DECODED_BLOCK_SIZE;
  int ENCODED_BLOCK_SIZE;
}
class EGLLogWrapper {
  int mArgCount;
  int mCheckError;
  int mLogArgumentNames;
  int mLog;
  int mEgl10;
}